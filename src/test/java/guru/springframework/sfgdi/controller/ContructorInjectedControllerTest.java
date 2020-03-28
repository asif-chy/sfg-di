package guru.springframework.sfgdi.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.ConstructorGreetingServiceImpl;


public class ContructorInjectedControllerTest {
	
	ContructorInjectedController controller;

	@Before
	public void setUp() throws Exception {
		controller = new ContructorInjectedController(new ConstructorGreetingServiceImpl());
	}

	@Test
	public void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
