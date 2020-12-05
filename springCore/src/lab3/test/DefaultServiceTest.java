package lab3.test;

import lab3.DefaultService;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DefaultServiceTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"lab3/beans.xml"});
		
		BeanFactory factory = context;
		
		Object obj = (Object)factory.getBean("exampleBean");
		System.out.println(obj.getClass().getName());
		System.out.println(obj);
		
		System.out.println(factory.getBean("exampleBean"));
	}
}
