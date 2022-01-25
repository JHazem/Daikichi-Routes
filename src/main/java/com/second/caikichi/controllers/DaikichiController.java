package com.second.Daikichi.controllers;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/daikichi")
	public class DaikichiController {

	        @RequestMapping("")
	        public String hello() {
	                return "Welcome";
	                }

	        @RequestMapping("/today")
	        public String today() {
	                return "Today you will find luck in all your endevaros!";
	                }

	        @RequestMapping("/tomorrow")
	        public String tomorrow() {
	                return "Toommorrow, an apportunity will arise, so be sure to be open to new ideas!";
	                }
	        

	        @RequestMapping("/travel/{city}")
	        public String travel(@PathVariable String city) {
	                return "Congratulations! You will soon travel to " + city;
	                }
	        
	        @RequestMapping("/lotto/{id}")
	        public String lotto(@PathVariable int id) {
	                return "You will take a ground journey in the near future, but be wary of tempting offiers!";
	                }
	}

