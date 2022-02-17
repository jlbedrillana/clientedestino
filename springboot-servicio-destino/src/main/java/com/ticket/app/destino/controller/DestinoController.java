package com.ticket.app.destino.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/destino")
public class DestinoController {

	@GetMapping("/consulta")
	public String test() {
		return "Hola Destino";
	}
	
}
