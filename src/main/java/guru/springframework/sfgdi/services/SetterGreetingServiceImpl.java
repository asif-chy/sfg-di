package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService{
	
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hola Mundo!";
	}

}
