package de.fhb.mobile.ToDoListAndroidApp.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import android.provider.ContactsContract;
import android.text.format.DateFormat;

public class Todo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -13463587883686746L;
	private long id;
	private String name;
	private String description;
	private boolean finished;
	private boolean favorite;
	private Date expireDate;
	private String contacts;
	
	public Todo(long id) {
		this.id = id;
	}
	
	public Todo(long id, String name, String description, boolean finished,
			boolean favorite, Date expireDate, String contacts) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.finished = finished;
		this.favorite = favorite;
		this.expireDate = expireDate;
		this.contacts = contacts;
	}

	public Todo() {

	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	public boolean isFavorite() {
		return favorite;
	}
	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}
	
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public String getContacts() {
		return contacts;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	@Override
	public String toString(){
		return this.getName();
	}
	
}