package com.project.angularspringevent.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="events")
@EntityListeners(AuditingEntityListener.class)
public class Event {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int event_id;
	private String title;
	private String place;
	private Date start_date;
	private Date end_date;
	private Date booking_start_date;
	private Date booking_end_date;
	private String address;
	private String description;
	private double price;
	private String status;
	private int available_seat;
	private Date create_date;
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
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
	public Date getBooking_start_date() {
		return booking_start_date;
	}
	public void setBooking_start_date(Date booking_start_date) {
		this.booking_start_date = booking_start_date;
	}
	public Date getBooking_end_date() {
		return booking_end_date;
	}
	public void setBooking_end_date(Date booking_end_date) {
		this.booking_end_date = booking_end_date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAvailable_seat() {
		return available_seat;
	}
	public void setAvailable_seat(int available_seat) {
		this.available_seat = available_seat;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	@Override
	public String toString() {
		return "Event [event_id=" + event_id + ", title=" + title + ", place=" + place + ", start_date=" + start_date
				+ ", end_date=" + end_date + ", booking_start_date=" + booking_start_date + ", booking_end_date="
				+ booking_end_date + ", address=" + address + ", description=" + description + ", price=" + price
				+ ", status=" + status + ", available_seat=" + available_seat + ", create_date=" + create_date + "]";
	}
	
	
}
