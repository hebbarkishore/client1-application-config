package com.spring.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigCientController {
	@Value("${my-name}")
	private String name;
	
	@GetMapping("/getMyName")
	public String getMyName() {
		return "My name is:"+name;
	}
}
