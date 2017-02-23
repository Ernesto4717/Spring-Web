package com.softtek.academy.end.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.softtek.academy.end.domain.UserRole;
import com.softtek.academy.end.repository.UserRoleRepository;

@Service
public class UserRoleService {
	private UserRoleRepository userRoleRepository = new UserRoleRepository();

	public List<UserRole> getUserRoles() {
		return this.userRoleRepository.getUserRoles();
	}
}
