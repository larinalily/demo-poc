package com.magellan.demopoc.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("test_1")
	public String test_1() {
		return "hello world";
	}
}
