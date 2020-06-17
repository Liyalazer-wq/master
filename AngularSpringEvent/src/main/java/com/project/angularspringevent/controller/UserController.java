package com.project.angularspringevent.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.angularspringevent.model.User;
import com.project.angularspringevent.repository.UserRepository;

@RestController
public class UserController {
	
	private final UserRepository repository;

	UserController(UserRepository repository) {
	    this.repository = repository;
	  }
	@PostMapping("/registration")
	public User registration(@RequestBody User user) {
		return repository.save(user);
	}
	
	@DeleteMapping(path="/deleteUser/{user_id}")
	public  void deleteUser(User user_id) {
	    repository.delete(user_id);
	  }

	
	 @GetMapping("/users")
	  List<User> all() {
		 System.out.println("jjjjjjjjjjjjjjjjjjjjjjj");
	    return repository.findAll();
	  }
	 
	 @GetMapping({"/", "/welcome"})
	    public String welcome(Model model) {
		System.out.println("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
	        return "welcome";
	    }
		
	 @PutMapping("/UpdateUser/{user}")
		public String save(@ModelAttribute("user") User user) {
		 repository.save(user);
			return "success";
		}
	 
	
}
