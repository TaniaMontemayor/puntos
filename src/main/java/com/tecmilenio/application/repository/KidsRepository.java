package com.tecmilenio.application.repository;

import org.springframework.data.repository.CrudRepository;
import com.tecmilenio.application.model.Kids;

public interface KidsRepository extends CrudRepository<Kids, Long> {
	 
}
