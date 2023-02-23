package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="anagrafica")
@NoArgsConstructor
@AllArgsConstructor
public class Anagrafica {
Private int id;
Private String nome;
Private String cognome;
Private String telefono;
Private String email;
Private String cf;
Private String indrizzo;
}
