package com.example.cep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.cep.domain.Endereco;
import com.example.cep.domain.Restaurante;
import com.example.cep.repository.RestauranteRepository;

import reactor.core.publisher.Flux;

@Service
public class RestauranteService {
	
	@Autowired
	private RestauranteRepository restauranteRepository;
	
	@Autowired
	private WebClient webClient;
	
	@Transactional
	public Restaurante cadastrar(Restaurante restaurante) {
		
		Flux<Endereco> enderecoWs = webClient.get()
        .uri("/ws/".concat(restaurante.getEndereco().getCep()).concat("/json/"))
        .retrieve()
        .bodyToFlux(Endereco.class);
		
		restaurante.setEndereco(enderecoWs.blockFirst());
		return restauranteRepository.save(restaurante);
	}

}
