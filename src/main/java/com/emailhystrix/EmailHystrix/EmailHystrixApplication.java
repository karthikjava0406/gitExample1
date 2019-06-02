package com.emailhystrix.EmailHystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("email")
public class EmailHystrixApplication {
	
	@GetMapping("/eml")
	public String emailhit(){
		return "this is email";
	}

	public static void main(String[] args) {
		SpringApplication.run(EmailHystrixApplication.class, args);
	}

}
