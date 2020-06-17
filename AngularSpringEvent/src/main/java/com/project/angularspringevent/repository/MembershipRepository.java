package com.project.angularspringevent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.angularspringevent.model.MemberShip;

public interface MembershipRepository extends JpaRepository<MemberShip,Long> {

}
