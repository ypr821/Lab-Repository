package com.example.test;

import java.util.Locale;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class TestApplication {

  public static void main(String[] args) {
    SpringApplication.run(TestApplication.class, args);
    System.out.println("hello world!!!!!!!");

    String test = "number_of_orders";
    System.out.println(test.toUpperCase(Locale.ROOT));
  }

}
