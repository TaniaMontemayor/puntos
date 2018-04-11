package com.tecmilenio.application.repository;

import org.springframework.data.repository.CrudRepository;
import com.tecmilenio.application.model.Phase;

public interface PhaseRepository extends CrudRepository<Phase, Long> {
	 
}
