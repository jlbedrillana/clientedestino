package com.ticket.app.cliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private RestTemplate clienteRest;
	
	@Value("${api.url.destino}")
	private String urlDestino;
	
	@GetMapping("/consulta1")
	public String test() {
		return "Hola Cliente";
	}
	
	@GetMapping("/consulta2")
	public String test2() {
		
		String respuesta = clienteRest.getForObject(urlDestino + "/destino/consulta", String.class );
		
		return respuesta;
	}

}
