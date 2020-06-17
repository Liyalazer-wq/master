package com.project.angularspringevent.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.angularspringevent.model.MemberShip;
import com.project.angularspringevent.repository.MembershipRepository;

@RestController
public class MembershipController {

private final MembershipRepository repository;
	
MembershipController(MembershipRepository repository) {
	    this.repository = repository;
	  }
	@PostMapping("/addMemberShip")
	public MemberShip addMemberShip(@RequestBody MemberShip membership) {
		return repository.save(membership);
	}
	
	@DeleteMapping(path="/deleteMembership/{membership_id}")
	public  void deleteMembership(MemberShip membership_id) {
	    repository.delete(membership_id);
	  }

	
	 @GetMapping("/membership")
	  List<MemberShip> all() {
	    return repository.findAll();
	  }
	 
	 
	 @PutMapping("/UpdateMembership/{membership_id}")
		public String save(@ModelAttribute("membership") MemberShip membership) {
		 repository.save(membership);
			return "success";
		}
	 
//	  @GetMapping("/getMembershipByID/{membership_id}")
//	  MemberShip one(@PathVariable Long membership_id) {
//
//	    return repository.findById(membership_id)
//	      .orElseThrow(() -> new MemberShipNotFoundException(membership_id));
//	  }
	
//	 @GetMapping("/getMembershipByID/{membership_id}")
//	 public getMembershipByID <MemberShip>(@PathVariable(value="membership_id")Long membership_id) {
//		  repository.findById(membership_id);
//	 }
}
