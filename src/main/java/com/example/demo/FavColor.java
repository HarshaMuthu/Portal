package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FavColor {
	private String fav="Purple";
	@GetMapping("/fav")
	public String getMyFav() {
		return "My favorite color "+fav;
	}

}
