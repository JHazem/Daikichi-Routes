package com.second.caikichi.controllers;

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
}
