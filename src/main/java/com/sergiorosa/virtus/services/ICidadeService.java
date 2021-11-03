package com.sergiorosa.virtus.services;

import java.util.List;

import com.sergiorosa.virtus.model.Cidade;
import com.sergiorosa.virtus.model.Estado;

public interface ICidadeService {
	
		public List<Cidade> getCidadesByEstado(Estado e);

		public Cidade getCidadeById(int id);
}
