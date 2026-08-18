package coforge.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class UserController {

	@RequestMapping("/userform")
	public String form() {
		return "UserForm";
	}
	@GetMapping
	//@RequestMapping("/")
	public String index() {
		return "Index";
	}
}
