package com.sergiorosa.virtus.services;

import java.util.List;

import com.sergiorosa.virtus.model.Estado;

public interface IEstadoService {
	
	public Estado getEstadoById(int id);

	public List<Estado> getAllEstados();

}
