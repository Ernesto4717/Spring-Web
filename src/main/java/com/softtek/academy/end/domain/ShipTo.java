package com.softtek.academy.end.domain;

import java.util.Objects;

import com.google.common.base.MoreObjects;

public class ShipTo {

	private Long id;
	private String name;
	
	
	public ShipTo(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {

		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final ShipTo other = (ShipTo) obj;
		return Objects.equals(this.id, other.id)
				&& Objects.equals(this.name, other.name);
	}

	@Override
	public int hashCode() {

		return Objects.hash(this.id, this.name);

	}

	@Override
	public String toString() {

		return MoreObjects.toStringHelper(this).add("id", id).add("name", name).toString();

	}
}
