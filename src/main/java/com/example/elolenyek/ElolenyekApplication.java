package com.example.elolenyek;

import elolenyek.Dog;
import elolenyek.Vihar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElolenyekApplication {

	public static void main(String[] args) {

		//SpringApplication.run(ElolenyekApplication.class, args);

		Dog dog = new Dog("Kántor",4);
		System.out.println(dog);
		System.out.println(dog.getName());
		System.out.println(dog.getLabakszama());

		Vihar vihar = new Vihar("Bodri", "villám", "megdöglött");
		System.out.println(vihar.getName()+"ba belecsapott a "+vihar.getVillam()+" emiatt szegény "+ vihar.getMeghal()+" !");


	}

}
