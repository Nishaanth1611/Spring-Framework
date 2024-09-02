package com.nishaanth.learnspringbase.helloworld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int Age, Address address) {};
record Address(String firstLine, String City) {};

@Configuration

public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Nishaanth";
	}
	
	@Bean
	public int age() {
		return 22;
	}
	@Bean
	public Person person() {
		return new Person("Ishan",22,new Address("3/4,Telugu Chetty Street","Chennai"));
	}
	@Bean
	public Person person2MethodCall() {
		return new Person(name(),age(),address());
	}
	@Bean
	public Person person3Para(String name, int age, Address address) {
		return new Person(name,age,address);
	}
	@Bean
	public Address address() {
		return new Address("308,3rd Main Road","Chennai");
	}
	
}
