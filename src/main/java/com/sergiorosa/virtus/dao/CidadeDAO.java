package com.sergiorosa.virtus.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sergiorosa.virtus.model.Cidade;
import com.sergiorosa.virtus.model.Estado;

public interface CidadeDAO extends CrudRepository<Cidade, Integer> {
	public List<Cidade> findAllByEstado(Estado e);

}
