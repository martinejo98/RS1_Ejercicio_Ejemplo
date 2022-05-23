package com.example.Ejercicio6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class Ejercicio6Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio6Application.class, args);
	}

	@Bean
	public Greeting greeting1(){
		Greeting greeting1 = new Greeting();
		return greeting1;
	}

	@Bean
	public ArrayList<Greeting> listaUsuarios(){
		ArrayList<Greeting> lista = new ArrayList<>();
		return lista;
	}
}
