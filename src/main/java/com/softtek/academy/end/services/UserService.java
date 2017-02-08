package com.softtek.academy.end.services;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.softtek.academy.end.domain.User;
import com.softtek.academy.end.domain.UserRole;
import com.softtek.academy.end.repository.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository = new UserRepository();

	public List<User> list() {
		List<User> users = userRepository.list();

		return users;
	}

	public User findOne(final String userName) {
		return userRepository.findOne(userName);
	}

	public Boolean update(final User user) {
		if (this.isValidUser(user)) {
			/*
			 * Not implemented yet...
			 * userRepository.update(user);
			 */
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

	public User userUpdate(final HttpServletRequest request) {

		User user = new User();

		final String userName = request.getParameter("userName");
		final String password = StringUtils.isNotEmpty(request.getParameter("password"))
				? new String(request.getParameter("password")) : null;
		final String name = StringUtils.isNotEmpty(request.getParameter("name"))
				? new String(request.getParameter("name")) : null;
		final char active = (request.getParameter("active")).charAt(0);
		final String userRoleId = (request.getParameter("userRoleId"));
		// createUser, createDate, updateUser and updateDate will be updated in
		// cartService.update();

		user.setUserName(userName);
		user.setPassword(password);
		user.setName(name);
		user.setActive(active);
		user.setUserRoleId(new UserRole(userRoleId, StringUtils.EMPTY));

		return user;
	}

}
