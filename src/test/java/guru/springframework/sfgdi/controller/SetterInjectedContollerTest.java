package guru.springframework.sfgdi.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.sfgdi.services.ConstructorGreetingServiceImpl;

public class SetterInjectedContollerTest {

	SetterInjectedContoller controller;
	
	@Before
	public void setUp() throws Exception {
		
		controller = new SetterInjectedContoller();
		
		controller.setGreetingService(new ConstructorGreetingServiceImpl());
	}

	@Test
	public void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
