package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Anagrafica;

public interface AnagraficaInterface extends JpaRepository<Anagrafica,Integer> {

}
