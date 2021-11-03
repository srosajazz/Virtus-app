package com.sergiorosa.virtus.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiorosa.virtus.model.Cidade;
import com.sergiorosa.virtus.model.Paroquia;

public interface ParoquiaDAO extends JpaRepository<Paroquia, Integer> {
	
	public Page<Paroquia>findAllByCidade(Cidade c, org.springframework.data.domain.Pageable pageable);
}


