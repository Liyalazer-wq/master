package com.project.angularspringevent.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.angularspringevent.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
