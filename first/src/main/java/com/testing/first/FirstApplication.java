package com.testing.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstApplication {

	  public static void main(String[] args) {
          SpringApplication.run(FirstApplication.class, args);
          System.out.println("the Server is up and running at port 8080!");
      }


}
