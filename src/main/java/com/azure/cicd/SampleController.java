package com.azure.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class SampleController {
	
	@GetMapping(value="/test")
	public String testMethod() {
		return  "Welcome to azure ! ";
		
	}

}
