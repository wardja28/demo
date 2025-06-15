package com.thrivent.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	// Person class with name and age
	static class Person {
		private String name;
		private int age;

		// Constructor to initialize name and age
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		// Method to print name and age
		public void printInfo() {
			System.out.println("Name: " + name + ", Age: " + age);
		}

		// Method to update name and age
		public void update(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		// Create a new Person object
		Person person = new Person("John", 30);
		// Print initial info
		person.printInfo();

		// Update name and age
		person.update("Jane", 25);
		// Print updated info
		person.printInfo();
	}

}
