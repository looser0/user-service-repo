package com.cardekho.userservice.service.impl;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardekho.userservice.model.User;
import com.cardekho.userservice.repository.UserRepository;
import com.cardekho.userservice.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger logger = LogManager.getLogger(UserServiceImpl.class);

	@Autowired
	private UserRepository userRepository;

	@Override
	public User findById(Integer id) {
		logger.info("Inside findById method of UserServiceImpl class started...");
		try {
			User user = new User();
			user.setFirstName("Narasimha");
			user.setLastName("Pulaparthi");
			user.setStatus("active");

			Date createdDate = new Date();
			user.setModifiedDate(createdDate);
			user.setCreatedDate(createdDate);

			userRepository.save(user);
			logger.info("User id " + user.getUserId());
		} catch (Exception exception) {
			logger.error("Exception at findById method ", exception);
		}

		return null;
	}

}
