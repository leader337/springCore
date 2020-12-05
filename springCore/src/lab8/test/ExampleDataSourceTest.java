package lab8.test;

import lab8.ExampleDataSource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExampleDataSourceTest {
	public static final String TEST_NAME = "NAME";
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"lab8/beans.xml"});
		
		BeanFactory factory = context;
		
		ExampleDataSource dataSource = (ExampleDataSource)factory.getBean("dataSource");
		System.out.println(dataSource);
	}
}
