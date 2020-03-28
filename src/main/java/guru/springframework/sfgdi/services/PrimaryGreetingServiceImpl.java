package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService {
	
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hola Mundo! --- From Primary";
	}

}
