package com.sergiorosa.virtus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sergiorosa.virtus.model.Cidade;
import com.sergiorosa.virtus.model.Estado;
import com.sergiorosa.virtus.services.ICidadeService;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CidadeController {
	
	@Autowired
	private ICidadeService cidadeService;
	
	@GetMapping("/cidades/{id}")
	public ResponseEntity<Cidade> recuperarPeloId(@PathVariable int id){
		Cidade c = cidadeService.getCidadeById(id);
		if (c != null) {
			return ResponseEntity.ok(c);
		}
		return ResponseEntity.notFound().build();
	}
	
	
	@GetMapping("/cidades")
	public ResponseEntity<List<Cidade>> recuperarPeloEstado(@RequestParam(name="estado") int estado){
		Estado e = new Estado();
		e.setId(estado);
		return ResponseEntity.ok(cidadeService.getCidadesByEstado(e));
	}
}