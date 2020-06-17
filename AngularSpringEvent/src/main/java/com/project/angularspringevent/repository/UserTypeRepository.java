package com.project.angularspringevent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.angularspringevent.model.UserType;
public interface UserTypeRepository extends JpaRepository <UserType,Long> {

}
