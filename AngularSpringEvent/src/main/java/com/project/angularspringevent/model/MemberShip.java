package com.project.angularspringevent.model;


import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="memership")
@EntityListeners(AuditingEntityListener.class)
public class MemberShip {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private  int membership_id;
	
	private String title;
	
	private String duration;
	
	private double price;

	public int getMembership_id() {
		return membership_id;
	}

	public void setMembership_id(int membership_id) {
		this.membership_id = membership_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MemberShip [membership_id=" + membership_id + ", title=" + title + ", duration=" + duration + ", price="
				+ price + "]";
	}
	
	

}
