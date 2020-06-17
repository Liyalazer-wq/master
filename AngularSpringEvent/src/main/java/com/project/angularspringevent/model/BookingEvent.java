package com.project.angularspringevent.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="booking_event")
@EntityListeners(AuditingEntityListener.class)

public class BookingEvent {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int booking_id;
	
	private String status;
	
	private String no_of_member;
	
	private String no_of_children;
	
	private Date booking_date;
	
	private Date start_date;
	
	private Date end_date;
	
	@ManyToOne
    @JoinColumn(name = "event_id", referencedColumnName="event_id")
    private Event event_id;
	
	
	@ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName="user_id")
    private User user_id;


	public int getBooking_id() {
		return booking_id;
	}


	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getNo_of_member() {
		return no_of_member;
	}


	public void setNo_of_member(String no_of_member) {
		this.no_of_member = no_of_member;
	}


	public String getNo_of_children() {
		return no_of_children;
	}


	public void setNo_of_children(String no_of_children) {
		this.no_of_children = no_of_children;
	}


	public Date getBooking_date() {
		return booking_date;
	}


	public void setBooking_date(Date booking_date) {
		this.booking_date = booking_date;
	}


	public Date getStart_date() {
		return start_date;
	}


	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}


	public Date getEnd_date() {
		return end_date;
	}


	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}


	public Event getEvent_id() {
		return event_id;
	}


	public void setEvent_id(Event event_id) {
		this.event_id = event_id;
	}


	public User getUser_id() {
		return user_id;
	}


	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}
	
	
	
	
	
}
