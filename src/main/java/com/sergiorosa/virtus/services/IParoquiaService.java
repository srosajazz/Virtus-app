package com.sergiorosa.virtus.services;

import org.springframework.data.domain.Page;

import com.sergiorosa.virtus.model.Cidade;
import com.sergiorosa.virtus.model.Paroquia;

public interface IParoquiaService {

	public Page<Paroquia> getParoquiasPorCidade(Cidade c, int pagina);

	public Paroquia getParoquiaPeloId(int i);

}
