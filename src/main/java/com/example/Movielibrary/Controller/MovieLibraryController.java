package com.example.Movielibrary.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieLibraryController {
	
	@RequestMapping(value = "/")
	public String home() {
		return "frontpage.html";
	}
}
