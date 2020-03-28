package guru.springframework.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class ContructorInjectedController {
	
	private final GreetingService greetingService;

	@Autowired
	public ContructorInjectedController(@Qualifier("constructorGreetingServiceImpl")GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
