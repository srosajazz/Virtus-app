package com.sergiorosa.virtus;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.sergiorosa.virtus.model.Cidade;
import com.sergiorosa.virtus.model.Paroquia;
import com.sergiorosa.virtus.services.IParoquiaService;

@SpringBootTest
public class ParoquiaTests {
	
	@Autowired
	private IParoquiaService paroquiaService;
	
	@Test
	public void shouldReturnListaDeParoquiasPorCidade() {
		Cidade c = new Cidade();
		c.setId(1);
		Page<Paroquia> lista = paroquiaService.getParoquiasPorCidade(c, 0);
		Assertions.assertNotEquals(lista, null);
		
	}
	
	@Test
	public void shouldReturnDetalhesDeUmaParoquia() {
		Paroquia p =  paroquiaService.getParoquiaPeloId(1);
		Assertions.assertNotEquals(p, null);	
	}
}
