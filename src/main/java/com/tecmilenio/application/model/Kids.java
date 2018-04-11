package com.tecmilenio.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kids")
public class Kids {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long kidsId;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "edad", nullable = false)
	private Long edad;
	
	@Column(name = "churchId", nullable = false)
	private Long churchId;
	
	@Column(name = "categoryId", nullable = false)
	private Long categoryId;
	
	public Long getKidsId() {
		return kidsId;
	}

	public void setKidsId(Long phaseId) {
		this.kidsId = phaseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	

		public Long getEdad() {
			return edad;
		}

		public void setEdad(Long edad) {
			this.edad = edad;
		}

		public Long getChurchId() {
			return churchId;
		}

		public void setChurchId(Long churchId) {
			this.churchId = churchId;
		}

		public Long getCategoryId() {
			return categoryId;
		}

		public void setCategoryId(Long categoryId) {
			this.categoryId = categoryId;
		}
	

}
