package guru.springframework.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class SetterInjectedContoller {
	
	private GreetingService greetingService;
	
	@Qualifier("setterGreetingServiceImpl")
	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		// TODO Auto-generated method stub
		return greetingService.sayGreeting();
	}

}
