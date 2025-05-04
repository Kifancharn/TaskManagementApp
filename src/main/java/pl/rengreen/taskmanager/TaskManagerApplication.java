package pl.rengreen.taskmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//made a change

@SpringBootApplication
public class TaskManagerApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to task app");
		SpringApplication.run(TaskManagerApplication.class, args);
	}

}
