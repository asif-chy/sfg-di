package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgdi.controller.ContructorInjectedController;
import guru.springframework.sfgdi.controller.I18nController;
import guru.springframework.sfgdi.controller.MyController;
import guru.springframework.sfgdi.controller.PropertyInjectedController;
import guru.springframework.sfgdi.controller.SetterInjectedContoller;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		
		System.out.println(i18nController.sayHello()); 
		
		MyController myController = (MyController) ctx.getBean("myController");
		
		System.out.println("----Primary");
		
		System.out.println(myController.helloWorld());
		
		System.out.println("----Property");
		
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("----Setter");
		
		SetterInjectedContoller setterInjectedController = (SetterInjectedContoller) ctx.getBean("setterInjectedContoller");
		
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("----Contructor");
		
		ContructorInjectedController contructorInjectedController = (ContructorInjectedController) ctx.getBean("contructorInjectedController");
		
		System.out.println(contructorInjectedController.getGreeting());
		
		
	}

}
