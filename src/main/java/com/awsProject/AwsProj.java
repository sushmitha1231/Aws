package com.awsProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsProj {
	@GetMapping("/get")
	public String get() {
		return "This is aws project";
	}

}
