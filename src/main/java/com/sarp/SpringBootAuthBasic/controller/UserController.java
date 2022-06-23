package com.sarp.SpringBootAuthBasic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

//	@GetMapping("/users")
//    public User getUser(){
//        return new User("Defaut User", "1", 40);
//    }
	
	@GetMapping("/hello")
	public String sayHello(@RequestParam(required = false,defaultValue = "This is Basic Auth User") String name) {
		return "Hello "+name;
	}
}
