package com.bookingapp.agent.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bookingapp.agent.model.JwtUser;
import com.bookingapp.agent.security.JwtGenerator;

@RestController
@RequestMapping("/login")
public class TokenController {


    private JwtGenerator jwtGenerator;

    public TokenController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    @CrossOrigin
    @RequestMapping(produces="application/json", method=RequestMethod.POST)
    public String login(@RequestBody final JwtUser jwtUser) {    	
    	if(!jwtUser.getUsername().equals("asd") || !jwtUser.getPassword().equals("asd")) {
    		return "Error, invalid username or password";
    	}
        return jwtGenerator.generate(jwtUser);
    }
    
    @GetMapping
    @CrossOrigin
    public String getData() {    
        return "asdasdasdasd";
    }
    
        
}
