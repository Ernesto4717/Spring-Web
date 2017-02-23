package com.softtek.academy.end.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softtek.academy.end.domain.User;
import com.softtek.academy.end.services.UserService;

/**
 * Handles requests for the application home page.
 */
@RequestMapping(value = "/User")
@Controller
public class UserController {

	static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String root() {
		return "userHome";
	}

	@RequestMapping(value = "/List")
	public String List() {
		return "users";
	}

	@RequestMapping(value = "/ListData", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> users = userService.list();
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}

	@RequestMapping(value="/edit")
	public String edit(){
		return "editUser";
	}
	
//	@RequestMapping(value = "/editData")
//	public ResponseEntity<User> editUser(@RequestParam String username) {
//		
//		User user = userService.user(username);
//		return new ResponseEntity<User>(user, HttpStatus.OK);
//	}

	@RequestMapping(value = "/create")
	public String create() {
		return "createUser";
	}

//	@RequestMapping(value = "/update", method = RequestMethod.POST)
//	public String updateUser(@ModelAttribute User user, HttpServletRequest request) {
//
//		if (userService.update(user)) {
//			return "redirect:/User/List";
//		}
//		return "redirect:/User/edit?username=" + user.getUsername() + "&status=Not valid";
//
//	}
//
//	@RequestMapping(value = "/add", method = RequestMethod.POST)
//	public String addUser(@RequestBody User user) {
//		if (userService.create(user)) {
//			return "users";
//		}
//		return "create";
//	}
}
