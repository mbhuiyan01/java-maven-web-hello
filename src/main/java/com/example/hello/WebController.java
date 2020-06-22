package com.example.hello;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class WebController {

	@RequestMapping(method=RequestMethod.GET)
	String sayHello () {
		
		System.out.println("Hello, World!");
		
		return 5;//"hello1";
	}
}
