package com.tecmilenio.chispasAntorchas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.tecmilenio.application.model.Category;
import com.tecmilenio.application.repository.CategoryRepository;


@RestController
@RequestMapping("categorys")
public class CategoryController {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@RequestMapping("/new")
	public String insert(@RequestParam String name) {
		Category category = new Category();
		category.setName(name);
		categoryRepository.save(category);
		return category.getCategoryId().toString();
	}

}
