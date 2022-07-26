package springmvcserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("This is the home url");
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is the about controller");
		return "about";
	}
}