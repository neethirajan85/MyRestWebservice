package com.neethi.rest.webservice.MyRestWebservice.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.neethi.rest.webservice.MyRestWebservice.User.User;
import  com.neethi.rest.webservice.MyRestWebservice.User.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserRepository userRepository;

	// create
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void create(@RequestBody User user) {
		userRepository.save(user);
		System.out.println(user);
	}

	// read
	@GetMapping(value = "/{id}")
	public User read(@PathVariable int id) {
		System.out.println(userRepository.findOneById(id));
		return userRepository.findOneById(id);
	}
	
	// readAll
		@GetMapping(value = "/all")
		public List<User> readAll() {
			//System.out.println(userRepository.findOneById(id));
			return userRepository.findAll();
		}

	// update
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody User user) {
		userRepository.save(user);
	}

	// delete
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable String id) {
		userRepository.deleteById(id);
	}
}
