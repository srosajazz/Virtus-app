package com.sergiorosa.virtus.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sergiorosa.virtus.dao.CidadeDAO;
import com.sergiorosa.virtus.model.Cidade;
import com.sergiorosa.virtus.model.Estado;

@Component
public class CidadeServiceImpl implements ICidadeService{

	@Autowired 
	private CidadeDAO dao;
	
	@Override
	public List<Cidade> getCidadesByEstado(Estado e) {
		// TODO Auto-generated method stub
		return dao.findAllByEstado(e);
	}

	@Override
	public Cidade getCidadeById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).orElse(null);
	}
}
