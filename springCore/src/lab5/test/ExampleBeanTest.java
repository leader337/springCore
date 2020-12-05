package lab5.test;

import lab5.ExampleBean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExampleBeanTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"lab5/beans.xml"});
		
		BeanFactory factory = context;
		
		ExampleBean exampleBean = (ExampleBean)factory.getBean("exampleBean");
		
		System.out.println(exampleBean);
	}
}
