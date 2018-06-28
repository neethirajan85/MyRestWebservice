package com.neethi.rest.webservice.MyRestWebservice.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.neethi.rest.webservice.MyRestWebservice.User.User;

public interface UserRepository  extends MongoRepository <User, String>{

	public User findOneByName(String name);
	public User findOneById(int id);
}
