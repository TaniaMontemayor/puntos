package com.tecmilenio.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "phase")
public class Phase {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long phaseId;
	
	@Column(name = "name", nullable = false)
	private String name;

	public Long getPhaseId() {
		return phaseId;
	}

	public void setPhaseId(Long phaseId) {
		this.phaseId = phaseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
