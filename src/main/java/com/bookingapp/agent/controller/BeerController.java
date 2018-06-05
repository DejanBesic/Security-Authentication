package com.bookingapp.agent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/beer")
public class BeerController {

	
	@GetMapping
	public String beer() {
		return "Krusovice";
	}
	
}
