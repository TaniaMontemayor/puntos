package com.tecmilenio.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "church")
public class Church {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long churchId;
	
	@Column(name = "name", nullable = false)
	private String name;

	public Long getChurchId() {
		return churchId;
	}

	public void setChurchId(Long churchId) {
		this.churchId = churchId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
