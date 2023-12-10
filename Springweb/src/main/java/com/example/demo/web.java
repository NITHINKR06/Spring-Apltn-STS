package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class web {
	
	@GetMapping("/hello")
	@ResponseBody
	public String get(){
	    return "<h1 style=\"color: red; text-align: center;\">Welcome to my Webpage</h1>";
	}

}
