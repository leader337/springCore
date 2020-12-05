package lab4.test;

import lab4.ExampleBean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExampleBeanTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"lab4/beans.xml"});
		
		BeanFactory factory = context;
		
		ExampleBean exampleBean 
		                   = (ExampleBean)factory.getBean("exampleBean");
		
		ExampleBean exampleBeanOrder 
		                   = (ExampleBean)factory.getBean("exampleBeanOrder");
		
		System.out.println("exampleBean: "+exampleBean);
		System.out.println("exampleBeanOrder: "+exampleBeanOrder);
		
	}
}







