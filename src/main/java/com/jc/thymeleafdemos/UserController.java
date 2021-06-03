package com.jc.thymeleafdemos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	
	@GetMapping("/if-unless")
	public String users(Model model) {
		List<User> users = new ArrayList<>();
		
		
		
		users.add(new User("Julieta","juleta@mail.com", "ADMIN"));
		users.add(new User("Joshua","joshua@mail.com", "ADMIN"));
		users.add(new User("Carola","carola@mail.com", "ADMIN"));
		users.add(new User("Jaime","jaime@mail.com", "USER"));
		users.add(new User("Ariel","ariel@mail.com", "USER"));
		users.add(new User("Pablo","pablo@mail.com", "USER"));
		model.addAttribute("users", users);		
		return "if-unless";
	}
	
	@GetMapping("/switch-case")
	public String switchExample(Model model) {
		User user = new User("Joshua","joshua@mail.com", "ADMIN");
		model.addAttribute("user", user);		
		return "switch-case";		
	}
	

}
