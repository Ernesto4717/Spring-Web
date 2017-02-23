package com.softtek.academy.end.domain;

import java.util.Objects;

import com.google.common.base.MoreObjects;

public class Status {
	
	private Long id;
	private String description;
	private String type;

	
	public Status(Long id, String description, String type) {
		this.id = id;
		this.description = description;
		this.type = type;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public boolean equals(Object obj) {

		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Status other = (Status) obj;
		return Objects.equals(this.id, other.id)
				&& Objects.equals(this.description, other.description)
				&& Objects.equals(this.description, other.description);
	}

	@Override
	public int hashCode() {

		return Objects.hash(this.id, this.description ,this.type);

	}

	@Override
	public String toString() {

		return MoreObjects.toStringHelper(this).add("id", id).add("description", description).toString();

	}
}
