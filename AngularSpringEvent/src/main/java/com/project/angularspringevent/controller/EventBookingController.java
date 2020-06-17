package com.project.angularspringevent.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.angularspringevent.model.BookingEvent;
import com.project.angularspringevent.model.MemberShip;
import com.project.angularspringevent.repository.EventBookingRepository;

@RestController
public class EventBookingController {
	private final EventBookingRepository repository;

	EventBookingController(EventBookingRepository repository) {
	    this.repository = repository;
	  }
	@PostMapping("/booking")
	public BookingEvent registration(@RequestBody BookingEvent bookingEvent) {
		return repository.save(bookingEvent);
	}
	
	@DeleteMapping(path="/deleteBooking/{booking_id}")
	public  void deleteBooking(BookingEvent booking_id) {
	    repository.delete(booking_id);
	  }

	
	 @GetMapping("/bookingEvent")
	  List<BookingEvent> all() {
	    return repository.findAll();
	  }
	 
	 
	 @PutMapping("/UpdateBooking/{booking_id}")
		public String save(@ModelAttribute("booking") BookingEvent booking) {
		 repository.save(booking);
			return "success";
		}
	 

}
