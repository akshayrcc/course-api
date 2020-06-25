package com.akshayrc.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

	@RequestMapping("/Hola")
	public String sayHola() {
		return "Hola mundo español aqui";
	}

	@RequestMapping("/Hallo")
	public String sayHallo() {
		return "Hallo Weltdeutsche hier";
	}
	
	@RequestMapping("/Hello")
	public String sayHello() {
		return "Hello World English here";
	}
}
