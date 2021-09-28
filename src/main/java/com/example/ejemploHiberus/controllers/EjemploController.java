/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ejemploHiberus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mohamad
 */
  @RestController
public class EjemploController {
      @GetMapping("/saludar")
    public String saludar(){
        return "Hola Mundo";
    }
              
}
