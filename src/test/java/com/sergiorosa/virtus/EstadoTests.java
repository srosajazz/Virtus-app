package com.sergiorosa.virtus;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sergiorosa.virtus.model.Estado;
import com.sergiorosa.virtus.services.IEstadoService;

@SpringBootTest
public class EstadoTests {
	
	@Autowired
	private IEstadoService estadoService;
	
//	@MockBean
//	private EstadoDAO dao;
	
	@Test
	public void shouldReturnTodosOsEstados() {
		
		List<Estado> estados;
		estados = estadoService.getAllEstados();
		Assertions.assertNotEquals(estados, null);
	}
	
	
	@Test
	public void estadoShouldExist() {
		Estado e = estadoService.getEstadoById(11);
		Assertions.assertNotEquals(e, null);
	}
	
//	@BeforeEach
//	public void setupBanco() {
//		Estado e = new Estado();
//		e.setId(11);
//		e.setNome("Rondonia");
//		e.setUf("RO");
//		System.out.println("DB print out...");
//		Mockito.when(dao.findById(11)).thenReturn(Optional.of(e));
//	}

}
