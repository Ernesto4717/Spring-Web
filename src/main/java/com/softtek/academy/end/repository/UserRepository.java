package com.softtek.academy.end.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softtek.academy.end.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	
	@Query(name = "findOneUser", nativeQuery = true)
	public User user(@Param ("username") String username);
	
	@Query(name="update", nativeQuery=true)
	public boolean updateUser(@Param ("password") String password,	
							@Param ("name") String name,
							@Param ("oldusername") String oldusername);
}
