package com.project.angularspringevent.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="user")
@EntityListeners(AuditingEntityListener.class)
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  int user_id;
	
	private String name;
	
	private String address;
	
	private String place;
	
	private double phone;
	
	private String email;
	
	private String status;
	
	private String password;
	
	@ManyToOne
    @JoinColumn(name = "type_id", referencedColumnName="type_id")
    private UserType type_id;
	
	@ManyToOne
    @JoinColumn(name = "membership_id",referencedColumnName="membership_id")
    private MemberShip membership_id;

	
	
	
	public UserType getType_id() {
		return type_id;
	}
	public void setType_id(UserType type_id) {
		this.type_id = type_id;
	}
	public MemberShip getMembership_id() {
		return membership_id;
	}
	public void setMembership_id(MemberShip membership_id) {
		this.membership_id = membership_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", address=" + address + ", place=" + place + ", phone="
				+ phone + ", email=" + email + ", status=" + status + ", password=" + password + "]";
	}
	
}
