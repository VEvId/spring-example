package com.dastin.springopenshift;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootTest
@RestController
public class SpringExampleApplication {

   @GetMapping("/")
   public String welcome() {
	   return "Welcome to java dastin";
   }
   @GetMapping("/{input}")
   public String congrats(PathVariable String input) {
	   return "hi " + input + " Your application deployed successfully....";
}
class SpringExampleApplicationTests {

	@Test
	void contextLoads() {
	}

}
