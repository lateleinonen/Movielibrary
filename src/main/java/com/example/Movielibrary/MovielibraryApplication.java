package com.example.Movielibrary;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Movielibrary.Domain.Movie;
import com.example.Movielibrary.Domain.MovieRepository;


@SpringBootApplication
public class MovielibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovielibraryApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(MovieRepository repository) {
		return (args) -> {
			repository.save(new Movie("Nasun Suuri Elokuva", "2003", "Animaatio"));
			repository.save(new Movie("Muumipeikko ja pyrstötähti", "1992", "Animaatio"));
			repository.save(new Movie("Liisa ihmemaassa", "1951", "Animaatio"));
		};	
	}
}