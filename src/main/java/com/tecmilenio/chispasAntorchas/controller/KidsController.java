package com.tecmilenio.chispasAntorchas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tecmilenio.application.model.Kids;
import com.tecmilenio.application.repository.KidsRepository;


@RestController
@RequestMapping("categorys")
public class KidsController {
	
	@Autowired
	private KidsRepository kidsRepository;
	
	@RequestMapping("/new")
	public String insert(@RequestParam String name) {
		Kids kids = new Kids();
		kids.setName(name);
		kidsRepository.save(kids);
		return kids.getKidsId().toString();
	}

}
