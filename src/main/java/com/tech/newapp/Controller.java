package com.tech.newapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@GetMapping(value="/print")
public String getMsg() {
	return "PROJECT DEPLOYED SUCCESSFULLY";
}
}
