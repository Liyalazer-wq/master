package com.project.angularspringevent.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.angularspringevent.model.Event;
import com.project.angularspringevent.repository.EventRepository;



@RestController
public class EventController {

	private final EventRepository repository;

	EventController(EventRepository repository) {
	    this.repository = repository;
	  }
	@PostMapping("/addEvent")
	public Event addEvent(@RequestBody Event event) {
		return repository.save(event);
	}
	
	@DeleteMapping(path="/deleteEvent/{event_id}")
	public  void deleteEvent(Event event_id) {
	    repository.delete(event_id);
	  }

//	
	
	@CrossOrigin(origins="http://localhost:4200")
	 @GetMapping("/events")
	  List<Event> all() {
	    return repository.findAll();
	  }
	 
	 
	 @PutMapping("/UpdateEvent/{booking_id}")
		public String save(@ModelAttribute("event") Event event) {
		 repository.save(event);
			return "success";
		}

}
