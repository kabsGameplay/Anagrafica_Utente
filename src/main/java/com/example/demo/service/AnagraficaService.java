package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Anagrafica;
import com.example.demo.repository.AnagraficaInterface;

@Service
public class AnagraficaService {
	public AnagraficaInterface anain;

	public Anagrafica anasave(Anagrafica a) {
		return anain.save(a);
	}
}
