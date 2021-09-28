/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ejemploHiberus.controllers;

import com.example.ejemploHiberus.entities.Persona;
import com.example.ejemploHiberus.repositories.PersonaRrepository;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mohamad
 */
  @RestController
public class EjemploController {
      private PersonaRrepository repo;
      @GetMapping("/saludar")
    public String saludar(){
        return "Hola Mundo";
    }
    
    @GetMapping("/add")
    public List<Persona> add(){
        Persona p=new Persona();
        p.setNombre(UUID.randomUUID().toString());
        repo.save(p);
        return repo.findAll();
    }
              
}
