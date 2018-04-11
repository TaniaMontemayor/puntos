package com.tecmilenio.chispasAntorchas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tecmilenio.application.model.Score;
import com.tecmilenio.application.repository.ScoreRepository;


@RestController
@RequestMapping("scores")
public class ScoreController {
	
	@Autowired
	private ScoreRepository scoreRepository;
	
	@RequestMapping("/new")
	public String insert(@RequestParam Long scoresc) {
		Score score = new Score();
		score.setScore(scoresc);
		scoreRepository.save(score);
		return score.getScoreId().toString();
	}

}
