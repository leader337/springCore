package lab2.test;

import lab2.ExampleBean;
import lab2.ExampleBeanTwo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ExampleBeanTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"lab2/beans.xml"});
		
		BeanFactory factory = context;
		
		ExampleBean exampleBean = (ExampleBean)factory.getBean("exampleBean");
		
		ExampleBeanTwo exampleBeanTwo 
		     = (ExampleBeanTwo)factory.getBean("anotherExample");
		
		ExampleBeanTwo ae= (ExampleBeanTwo)factory.getBean("ae");
		
		
		System.out.println(exampleBean);
		System.out.println(exampleBeanTwo);
		System.out.println(ae);
	}
}
