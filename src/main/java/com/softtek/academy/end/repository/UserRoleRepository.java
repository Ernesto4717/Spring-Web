package com.softtek.academy.end.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.softtek.academy.end.domain.UserRole;

public class UserRoleRepository {
	
	public List<UserRole> getUserRoles() {
		
        final List<UserRole> userRoles = new ArrayList<UserRole>();
        
        try (
        		Connection connection = DriverManagerDatabase.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(
                		"SELECT * FROM user_role");
        	) {
        	
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
            	userRoles.add(new UserRole(rs.getString("user_role_id"), rs.getString("description")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
		
		return userRoles; 
	}
}
