package com.Ejercicio4;

import com.Ejercicio4.entities.Laptop;
import com.Ejercicio4.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio4Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Ejercicio4Application.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		//Crud
		//Crear laptop

		Laptop laptop1 = new Laptop(null,"3GHz",16,"SSD",13,10,true);
		Laptop laptop2 = new Laptop(null,"5GHz",32,"Duro",11,7,false);
		Laptop laptop3 = new Laptop(null,"7GHz",64,"SSD",15,8,true);


		repository.save(laptop1);
		repository.save(laptop2);
		repository.save(laptop3);

		System.out.println(laptop1.getProcesador());

		System.out.println(repository.findAll().size());
	}

}
