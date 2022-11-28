

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

    public ResponseEntity<Laptop> findOneById(@PathVariable Long id) {

        Optional<Laptop> laptopOpt = laptopRepository.findById(id);

        if (laptopOpt.isPresent())
            return ResponseEntity.ok(laptopOpt.get());
        else
            return ResponseEntity.notFound().build();

    }


    //Create
    @PostMapping("/api/laptops")
    public void create (@RequestBody Laptop laptop){
        //guarda la laptop recibida por parametro en la base de datos
        laptopRepository.save(laptop);
    }

    //Update
    @PutMapping("/api/laptops")
    public String update(@RequestBody Laptop laptop){
        if(laptopRepository.existsById((laptop.getId()))){
            Laptop result = laptopRepository.save(laptop);
        }
        return "Los datos se han actualizado correctamente";
    }

    //Delete
    @DeleteMapping("/api/laptops/{id}")
    public String delete(@PathVariable Long id){

        laptopRepository.deleteById(id);

        return "Esta laptop se ha eliminado satisfactoriamente";

    }

    //Delete All
    @DeleteMapping("/api/laptops")
    public void deleteAll(){

        laptopRepository.deleteAll();

    }
}
