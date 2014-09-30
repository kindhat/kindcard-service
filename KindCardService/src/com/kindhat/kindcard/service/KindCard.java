package com.kindhat.kindcard.service;

import javax.jdo.annotations.Element;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import java.lang.String;
import java.util.List;
import java.util.Date;
import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class KindCard {

	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key id;
	
	@Persistent
	private String kindCardId;
	
	@Persistent
	private Date latestUserStoryDate;
	
	@Persistent( mappedBy = "kindCard")
	@Element(dependent = "true")
	private List<UserStory> userStories;
    
    public KindCard () {}

	public Key getId() {
		return id;
	}

	public void setId(Key id) {
		this.id = id;
	}

	public String get_kindCardId() {
		return kindCardId;
	}

	public void set_kindCardId(String kindCardId) {
		this.kindCardId = kindCardId;
	}
	
	public Date get_latestUserStoryDate() {
		return latestUserStoryDate;
	}

	public void set_latestUserStoryDate(Date latestUserStoryDate) {
		this.latestUserStoryDate = latestUserStoryDate;
	}

	public List<UserStory> get_userStories() {
		return userStories;
	}

	public void set_userStories(List<UserStory> userStories) {
		this.userStories = userStories;
	}   
}