package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Anagrafica;
import com.example.demo.service.AnagraficaService;

@RestController
public class AnagraficaController {
	@Autowired
	public AnagraficaService anaser;
	@PostMapping("/addanagrafica")
	public String addanagrafica(@RequestBody Anagrafica anagrafi) {
		anaser.anasave(anagrafi);
		return "successo";
	}
}
