package de.gvl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
@SpringBootApplication
@EnableTask
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}

