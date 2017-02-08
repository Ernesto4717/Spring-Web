package com.softtek.academy.end.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.academy.end.domain.Cart;
import com.softtek.academy.end.repository.CartRepository;

@Service
public class CartService {

	@Autowired
	private CartRepository cartRepository;

	public List<Cart> list() {
		List<Cart> carts = cartRepository.list();
		return carts;
	}

	public Cart findOne(final Long cartId) {
		return cartRepository.findOne(cartId);
	}

	public Boolean update(final Cart cart) {
		if (this.isValidCart(cart)) {
			/*
			 * cartRepository.update(cart);
			 */
			return true;
		}

		return false;
	}

	private Boolean isValidCart(final Cart cart) {

		if (cart.getLinesAmount() == null) {
			return false;
		}

		if (cart.getShippingAmount() == null) {
			return false;
		}

		if (cart.getShipTo() == null || cart.getShipTo().getId().equals(0L)) {
			return false;
		}

		if (cart.getStatus() == null || cart.getStatus().getId().equals(0L)) {
			return false;
		}

		return true;
	}

}