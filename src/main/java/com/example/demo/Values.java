package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.*;

@RestController
public class Values {
	
	@Value("${msg}")private String testPageString;
    @GetMapping ("/")
	public String getValue() {
		return "Welcome to this "+testPageString;
	}


}
