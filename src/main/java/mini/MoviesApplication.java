package com.minimoviemr.Movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@RestController
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

//	@GetMapping("/root") /* this is to change the url or manage the api in the browser
//	here if we add /root after localhost:8080/root then it'll show us
//	that we are printing hello world or whatever is in the api end point */
//
//	public String apiRoot(){ //this method right here is to create an end point of the api
//		return "hello world";
//	}
}
