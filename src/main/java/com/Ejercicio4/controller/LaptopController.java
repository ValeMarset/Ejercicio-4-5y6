package com.Ejercicio4.controller;


import com.Ejercicio4.entities.Laptop;
import com.Ejercicio4.repository.LaptopRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    //findById

    @GetMapping("/api/laptops/{id}")
    public Laptop findOneById(@PathVariable Long id){
        Optional<Laptop> obtenerLaptop = laptopRepository.findById(id);

        if(obtenerLaptop.isPresent())
            return obtenerLaptop.get();

    }

    //Create
    @PostMapping("/api/laptops")
    public void create (@RequestBody Laptop laptop){
        //guarda la laptop recibida por parametro en la base de datos
        laptopRepository.save(laptop);
    }

    //Update
    @PutMapping("/api/laptops")
    public Laptop update(@RequestBody Laptop laptop){
        return null;
    }
}
