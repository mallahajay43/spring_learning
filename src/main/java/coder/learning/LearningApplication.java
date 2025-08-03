package coder.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import coder.learning.beantesting.BeanInjection;

@SpringBootApplication
public class LearningApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LearningApplication.class, args);
	}

	// Autowiring the BeanInjection class to use its methods
	// This is the dependency injection part of Spring
	// Cons of the this type of injection is that we can't make variables final
	// because they need to be initialized by the Spring container
	@Autowired
	private final BeanInjection beanInjection;

	// Constructor-based injection is preferred for mandatory dependencies
	// It allows us to declare the dependency as final, ensuring it is always initialized
	// We can uncomment the @Autowired annotation if we want to use it.
	public LearningApplication(BeanInjection beanInjection) {
		this.beanInjection = beanInjection;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(beanInjection.getMessage());
	}

}
