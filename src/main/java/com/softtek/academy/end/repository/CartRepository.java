package com.softtek.academy.end.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softtek.academy.end.domain.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long>{
	
	@Query(name = "findOneCart", nativeQuery = true)
	public Cart cart(@Param ("cartId") Long cart_id);
	
	
}
