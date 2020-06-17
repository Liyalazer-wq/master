package com.project.angularspringevent.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.angularspringevent.model.User;
import com.project.angularspringevent.model.UserType;
import com.project.angularspringevent.repository.UserRepository;
import com.project.angularspringevent.repository.UserTypeRepository;

@RestController
public class UserTypeController {

	private final UserTypeRepository repository;
	
	UserTypeController(UserTypeRepository repository) {
	    this.repository = repository;
	  }
	@PostMapping("/addUsertype")
	public UserType addUsertype(@RequestBody UserType usertype) {
		return repository.save(usertype);
	}
	@DeleteMapping(path="/deleteUsertype/{type_id}")
	public  void deleteUser(UserType type_id) {
	    repository.delete(type_id);
	  }

	
	 @GetMapping("/usertypes")
	  List<UserType> all() {
	    return repository.findAll();
	  }
	 
	 
	 @PutMapping("/UpdateUsertype/{userType}")
		public String save(@ModelAttribute("user") UserType userType) {
		 repository.save(userType);
			return "success";
		}
	 
}
