package com.digitalinnovationone.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Para marcar que a classe é um controller e vai retornar somente texto.
public class HelloController {
	
	@GetMapping("/") // Mapear uma operação Rest para retornar esata mensagem através do browser.
	public String helloMessage() {
		return "Hello, Digital Innovation One!";
	}
	
}
