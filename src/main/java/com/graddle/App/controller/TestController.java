package com.graddle.App.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping
	public String saludos(@RequestParam(required = false, defaultValue = "") String nombre) {
		return "".equals(nombre) ? "Hello World of Graddle!!!" : "Hola " + nombre + " from Graddle!!!!";
	}
}
