package com.sergiorosa.virtus.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sergiorosa.virtus.dao.EstadoDAO;
import com.sergiorosa.virtus.model.Estado;


@Component
public class EstadoServiceImpl implements IEstadoService {
	

@Autowired
private EstadoDAO dao;

	@Override
	public Estado getEstadoById(int id) {
		return dao.findById(id).orElse(null);
	}

	@Override
	public List<Estado> getAllEstados() {
		// TODO Auto-generated method stub
		return (List<Estado>)dao.findAll();
	}

}
