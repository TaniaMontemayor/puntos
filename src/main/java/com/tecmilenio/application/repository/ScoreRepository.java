package com.tecmilenio.application.repository;

import org.springframework.data.repository.CrudRepository;

import com.tecmilenio.application.model.Score;

public interface ScoreRepository extends CrudRepository<Score, Long> {
	 
}
