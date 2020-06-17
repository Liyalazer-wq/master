package com.project.angularspringevent.model;



import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="user_type")
@EntityListeners(AuditingEntityListener.class)

public class UserType {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private  int type_id;
	
	private String type;

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "UserType [type_id=" + type_id + ", type=" + type + "]";
	}
	
	
}
