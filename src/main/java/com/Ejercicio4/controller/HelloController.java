package com.Ejercicio4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hola")
    public String Saludo(){
        return "Hola Mundo! Hoy es 23 de Noviembre del 2022 :)";
    }


}
