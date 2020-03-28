package guru.springframework.sfgdi.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.sfgdi.services.ConstructorGreetingServiceImpl;

public class PropertyInjectedControllerTest {
	
	PropertyInjectedController controller;

	@Before
	public void setUp() throws Exception {
		
		controller = new PropertyInjectedController();
		
		controller.greetingService = new ConstructorGreetingServiceImpl();
	
	}

	@Test
	public void testGetGreeting() {
		System.out.println(controller.getGreeting());;
	}

}
