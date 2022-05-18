package com.fam.gastos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fam.gastos.model.Moneda;
import com.fam.gastos.services.MonedaService;

@RestController
public class MonedaController {

	@Autowired
	private MonedaService monedaService;
	
	@GetMapping("/monedas")
	public List<Moneda> findAll(){
		return monedaService.findAll();
	}
}
