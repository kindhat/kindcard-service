package com.kindhat.kindcard.service;

import com.kindhat.kindcard.service.PMF;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.datanucleus.query.JDOCursorHelper;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import javax.inject.Named;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.Transaction;

@Api(name = "kindcardendpoint", 
     namespace = @ApiNamespace(ownerDomain = "kindhat.com", 
     						   ownerName = "kindhat.com", 
     						   packagePath = "kindcard.service"))
public class KindCardEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	*/
	
	@SuppressWarnings({"unchecked"})
	@ApiMethod(httpMethod = HttpMethod.GET, name = "listKindCards", path = "listKindCards")
	public CollectionResponse<KindCard> listKindCards(
			 @Named("cursor") String cursorString,
			 @Named("limit") Integer limit) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<KindCard> kindCards = null;

		try {
			mgr = getPersistenceManager();
			mgr.getFetchPlan().setMaxFetchDepth(-1);
			Query query = mgr.newQuery(KindCard.class);
			query.setFilter("latestUserStoryDate > latestUserStoryDateParam");
			query.declareImports("import java.util.Date");
			query.declareParameters("Date latestUserStoryDateParam");
			query.setOrdering("latestUserStoryDate desc");
			
			if (cursorString != null && cursorString != "") {
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				cursor = Cursor.fromWebSafeString(cursorString);				
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}
			Calendar calendar = Calendar.getInstance();
			calendar.set(1900,1,1);
			kindCards = (List<KindCard>) query.execute(calendar.getTime());
			for(KindCard kindcard : kindCards) {
				kindcard.get_userStories();
			}
			cursor = JDOCursorHelper.getCursor(kindCards);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			
		} finally {
			mgr.close();
		}

		return CollectionResponse.<KindCard> builder().setItems(kindCards)
				.setNextPageToken(cursorString).build();
	}
 
	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 * @throws Exception 
	 */
	@ApiMethod(name = "getKindCard")
	public KindCard getKindCard(@Named("id") long id) throws Exception {
		PersistenceManager mgr = getPersistenceManager();		
		KindCard kindCard = null;
		try {
			kindCard = mgr.getObjectById(KindCard.class, id);
			kindCard.get_userStories();
		} finally {
			mgr.close();
		}
		return kindCard;
	}	
	
	/**
	 * This method gets the entity by the actual KindCard ID string. It uses HTTP GET method.
	 *
	 * @param id the KindCard ID String
	 * @return The entity with the KindCard string id.
	 * @throws Exception 
	 */
	@SuppressWarnings("unchecked")
	@ApiMethod(httpMethod = HttpMethod.GET, 
			   name = "getKindCardByKindCardId",
			   path = "getByKindCardId/{kindCardId}")
	public KindCard getKindCardByKindCardId(@Named("kindCardId") String kindCardId) throws Exception {
		PersistenceManager mgr = getPersistenceManager();	
		List<KindCard> kindCards = null;
		KindCard kindCard = null;
		try {
			Query query = mgr.newQuery(KindCard.class);
			query.setFilter("kindCardId == kindCardIdParam");
			query.declareParameters("String kindCardIdParam");
			kindCards = (List<KindCard>) query.execute(kindCardId.toUpperCase());
			if(kindCards.isEmpty()) {
				kindCard = new KindCard(); //return an empty object
			}
			else {
				kindCard = kindCards.get(0);
				kindCard.get_userStories();
			}
		} finally {
			mgr.close();
		}
		return kindCard;
	}	

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param kindcard the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateKindCard")
	public KindCard updateKindCard(KindCard kindCard) {
		KindCard updateKindCard = null;
		PersistenceManager mgr = getPersistenceManager();
		try {
			updateKindCard = mgr.getObjectById(KindCard.class, kindCard.getId().getId());
			updateKindCard.set_latestUserStoryDate(kindCard.get_latestUserStoryDate());				
			if(updateKindCard.get_userStories() == null) {
				updateKindCard.set_userStories(new ArrayList<UserStory>());
			}
			for(UserStory userStory : kindCard.get_userStories()) {
				if(userStory.getId() == null) {					
					updateKindCard.get_userStories().add(0,userStory);
				}
			}			
			Transaction tx = mgr.currentTransaction();
			tx.begin();
			mgr.makePersistent(updateKindCard);
			tx.commit();
		} finally {
			mgr.close();
		}
		return updateKindCard;
	}		

	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}

}
