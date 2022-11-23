package com.Ejercicio4.controller;


import com.Ejercicio4.entities.Laptop;
import com.Ejercicio4.repository.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {

    //atributos
    private LaptopRepository laptopRepository;

    //constructores

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }


    //Metodo que devuelve la lista de laptops

    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        //Arriba creo el atributo laptopRepository y su constructor para poder usarlo aca abajo
        return laptopRepository.findAll();
    }

    @PostMapping("/api/laptops")
    public void create (@RequestBody Laptop laptop){
        //guarda el libre recibido por parametro en la base de datos
        laptopRepository.save(laptop);
    }
}
