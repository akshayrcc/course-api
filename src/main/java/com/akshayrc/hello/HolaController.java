package com.akshayrc.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

	@RequestMapping("/Hola")
	public String sayHi() {
		return "Hola Ka Dola 555";
	}

}
