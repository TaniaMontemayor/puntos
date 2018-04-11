package com.tecmilenio.application.repository;

import org.springframework.data.repository.CrudRepository;
import com.tecmilenio.application.model.Church;

public interface ChurchRepository extends CrudRepository<Church, Long> {
	 
}
