package com.example.userfeedback.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feedback")
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String emailid;
	private String rating;
	private String feedback;
	
	public Feedback() {}
	
	public Feedback(String emailid, String rating, String feedback) {
		super();
		this.emailid = emailid;
		this.rating = rating;
		this.feedback = feedback;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		return "Feedback [id=" + id + ", emailid=" + emailid + ", rating=" + rating + ", feedback=" + feedback + "]";
	}
	
	
}
