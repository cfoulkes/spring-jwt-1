package com.colin.unsecured;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignUpController {

	@PostMapping("/sign-up")
	public void signUp() {
		System.out.println("SignUp");
	}
	
}
