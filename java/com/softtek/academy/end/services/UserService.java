package com.softtek.academy.end.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.academy.end.domain.User;
import com.softtek.academy.end.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public List<User> list() {
		List<User> users = userRepository.list();

		return users;
	}

	public User findOne(final String userName) {
		return userRepository.findOne(userName);
	}

	public Boolean createUser(final User user) {
		if (this.isValidUser(user)) {
			userRepository.updateUser(user);
			return true;
		}

		return false;
	}

	private Boolean isValidUser(final User user) {

		if (user.getPassword() == null) {
			return false;
		}

		if (user.getName() == null) {
			return false;
		}
		if (user.getUserRoleId() == null) {
			return false;
		}

		return true;
	}


}
