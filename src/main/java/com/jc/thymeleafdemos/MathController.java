package com.jc.thymeleafdemos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MathController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("message", "Hola alumno");
		return "index";
	}

	@GetMapping("/mat/aritmetica/sumas")
	public String sumas(Model model) {
		model.addAttribute("message", "Hola alumno");
		return "mat/aritmetica/sumas";
	}
}
