package com.softtek.academy.end.domain;

import java.util.Objects;

import com.google.common.base.MoreObjects;

public class Cart {

	private Long id;
	private Double linesAmount;
	private Double shippingAmount;
	private Double cartAmount;
	private ShipTo shipTo;
	private Status status;

	
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getLinesAmount() {
        return this.linesAmount;
    }

    public void setLinesAmount(Double linesAmount) {
        this.linesAmount = linesAmount;
    }

    public Double getShippingAmount() {
        return this.shippingAmount;
    }

    public void setShippingAmount(Double shipToAmount) {
        this.shippingAmount = shipToAmount;
    }

    public Double getCartAmount() {
        return this.cartAmount;
    }

    public void setCartAmount(Double cartAmount) {
        this.cartAmount = cartAmount;
    }

    public ShipTo getShipTo() {
        return this.shipTo;
    }

    public void setShipTo(ShipTo shipTo) {
        this.shipTo = shipTo;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
	

	@Override
	public boolean equals(Object obj) {

		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Cart other = (Cart) obj;
		return Objects.equals(this.id, other.id) 
				&& Objects.equals(this.linesAmount, other.linesAmount)
				&& Objects.equals(this.shippingAmount, other.shippingAmount) 
				&& Objects.equals(this.cartAmount, other.cartAmount)
				&& Objects.equals(this.shipTo, other.shipTo);
	}

	@Override
	public int hashCode() {

		return Objects.hash(this.id, this.linesAmount, this.shippingAmount, this.cartAmount, this.shipTo);

	}

	@Override
	public String toString() {

		return MoreObjects.toStringHelper(this).add("id", id).add("linesAmount", linesAmount).toString();

	}

}
