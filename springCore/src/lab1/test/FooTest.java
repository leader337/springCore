package lab1.test;

import lab1.Bar;
import lab1.Baz;
import lab1.Foo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FooTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"lab1/beans.xml"});
		
		BeanFactory factory = context;
		
		Foo foo = (Foo)factory.getBean("foo");
		
		System.out.println(foo);
		
		Foo foo1 = (Foo)factory.getBean("foo1");
		System.out.println(foo1);
		
		
		Bar bar = (Bar)factory.getBean("bar");
		System.out.println(bar);
		
		Baz baz = (Baz)factory.getBean("baz");
		System.out.println(baz);
		
		
	}
}
