package com.example.cep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.cep.RestauranteService;
import com.example.cep.domain.Restaurante;

@RestController
@RequestMapping("/restaurantes")
public class RestauranteController {
	
	@Autowired
	private RestauranteService restauranteService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Restaurante listar(@RequestBody Restaurante restaurante) {
		return restauranteService.cadastrar(restaurante);
	}

}
