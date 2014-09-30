package com.kindhat.kindcard.service;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class UserStory {
	
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key id;
	
	@Persistent
	private KindCard kindCard;
	
	@Persistent
    private String userName;
	
	@Persistent
    private String location;
	
	@Persistent
    private String story;
	
	@Persistent
    private Date date;
	
	public UserStory () {}	
	
	public Key getId() {
		return id;
	}

	public void setId(Key id) {
		this.id = id;
	}
	
	public String get_userName() {
		return userName;
	}

	public void set_userName(String userName) {
		this.userName = userName;
	}

	public String get_location() {
		return location;
	}

	public void set_location(String location) {
		this.location = location;
	}

	public String get_story() {
		return story;
	}

	public void set_story(String story) {
		this.story = story;
	}

	public Date get_date() {
		return date;
	}

	public void set_date(Date date) {
		this.date = date;
	}
}