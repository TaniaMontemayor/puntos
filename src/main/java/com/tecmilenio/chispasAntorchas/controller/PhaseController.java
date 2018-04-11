package com.tecmilenio.chispasAntorchas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.tecmilenio.application.model.Phase;
import com.tecmilenio.application.repository.PhaseRepository;


@RestController
@RequestMapping("phases")
public class PhaseController {
	
	@Autowired
	private PhaseRepository phaseRepository;
	
	@RequestMapping("/new")
	public String insert(@RequestParam String name) {
		Phase phase = new Phase();
		phase.setName(name);
		phaseRepository.save(phase);
		return phase.getPhaseId().toString();
	}

}
