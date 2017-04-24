package pl.wasowski.jolka.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class MainController {
	@RequestMapping(method = RequestMethod.GET)
	public String crossword(Model model) {
		return "crossword";
	}
	
	@RequestMapping("page")
	public String page() {
		return "page";
	}
}
