package com.tecmilenio.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "score")
public class Score {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long scoreId;

	public Long getScoreId() {
		return scoreId;
	}

	public void setScoreId(Long scoreId) {
		this.scoreId = scoreId;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getPhaseId() {
		return phaseId;
	}

	public void setPhaseId(Long phaseId) {
		this.phaseId = phaseId;
	}

	public Long getKidsId() {
		return kidsId;
	}

	public void setKidsId(Long kidsId) {
		this.kidsId = kidsId;
	}

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	@Column(name = "categoryId", nullable = false)
	private Long categoryId;
	
	@Column(name = "phaseId", nullable = false)
	private Long phaseId;
	
	@Column(name = "kidsId", nullable = false)
	private Long kidsId;
	
	@Column(name = "score", nullable = false)
	private Long score;
	

	
}
