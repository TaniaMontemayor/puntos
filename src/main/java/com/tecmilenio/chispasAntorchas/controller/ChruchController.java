package com.tecmilenio.chispasAntorchas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tecmilenio.application.model.Church;
import com.tecmilenio.application.repository.ChurchRepository;

@RestController
@RequestMapping("churchs")
public class ChruchController {
	
	@Autowired
	private ChurchRepository churchRepository;
	
	@RequestMapping("/new")
	public String insert(@RequestParam String name) {
		Church church = new Church();
		church.setName(name);
		churchRepository.save(church);
		return church.getChurchId().toString();
	}

}
