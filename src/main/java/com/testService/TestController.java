package com.testService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@CrossOrigin
public class TestController {


	/**
	 *
	 * @return a
	 */
	@GetMapping("/home")
	public String homeRequest() {
		return "Hello World!";
	}
}
