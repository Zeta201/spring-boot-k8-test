package com.zetaspringboot.k8test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/hello-controller")
	public ResponseEntity<String> sayHello() {
		return ResponseEntity.ok("Hello world from REST API");
	}
	
	@GetMapping("/say-hello/{name}")
	public ResponseEntity<String> sayHelloName(@PathVariable String name){
		return ResponseEntity.ok("Hello "+name+" from API");
	}
}
