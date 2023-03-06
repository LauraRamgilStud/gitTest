package com.example.gittest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index";
    }


    @GetMapping("/shout")
    public String shout(){
	return "shout";
    }

    @GetMapping("/run")
    public String run(){
        return "run";
    }

	//it is working for me now!!

}
