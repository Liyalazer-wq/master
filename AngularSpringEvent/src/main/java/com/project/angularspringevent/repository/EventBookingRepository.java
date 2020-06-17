package com.project.angularspringevent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.angularspringevent.model.BookingEvent;

public interface EventBookingRepository  extends  JpaRepository<BookingEvent,Long> {

}
