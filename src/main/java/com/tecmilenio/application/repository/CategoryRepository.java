package com.tecmilenio.application.repository;

import org.springframework.data.repository.CrudRepository;
import com.tecmilenio.application.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
	 
}
