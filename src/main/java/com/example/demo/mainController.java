package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mainController {
	
	@Value("${file.upload}")
	String upload;
	
	@GetMapping("/")
	@ResponseBody
	public String main() {
		return "every hello :" + upload;
	}
}
