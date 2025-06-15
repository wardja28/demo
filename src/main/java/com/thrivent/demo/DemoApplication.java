package com.thrivent.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		List<String> names = Arrays.asList("John", "Jane", "Peter", "Anna", "John");

		// Filter names starting with 'J'
		List<String> filteredNames = names.stream()
				.filter(name -> name.startsWith("J"))
				.collect(Collectors.toList());

		System.out.println("Original names: " + names);
		System.out.println("Filtered names: " + filteredNames);

		// Filter out duplicates
		List<String> distinctNames = names.stream()
				.distinct()
				.collect(Collectors.toList());

		System.out.println("Distinct names: " + distinctNames);

		// Filter names based on length
		List<String> longNames = names.stream()
				.filter(name -> name.length() > 3)
				.collect(Collectors.toList());
		System.out.println("Long names: " + longNames);
	}

}
