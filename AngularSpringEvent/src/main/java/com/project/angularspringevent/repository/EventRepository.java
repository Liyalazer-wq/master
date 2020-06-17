package com.project.angularspringevent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.angularspringevent.model.Event;

	public interface EventRepository extends JpaRepository<Event,Long> {


}
