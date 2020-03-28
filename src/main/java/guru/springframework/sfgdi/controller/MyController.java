package guru.springframework.sfgdi.controller;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class MyController {
	
	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	private final GreetingService greetingService; 

		public String helloWorld() {
			
			return greetingService.sayGreeting();
			
		}
}
