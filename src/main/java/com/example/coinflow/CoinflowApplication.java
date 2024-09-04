package com.example.coinflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class CoinflowApplication {

	@GetMapping
	public String teste(){return "Teste ok!";}
	public static void main(String[] args) {
		SpringApplication.run(CoinflowApplication.class, args);
	}

}
