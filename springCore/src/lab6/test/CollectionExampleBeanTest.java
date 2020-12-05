package lab6.test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lab6.CollectionExampleBean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionExampleBeanTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"lab6/beans.xml"});
		
		BeanFactory factory = context;
		
		
		CollectionExampleBean exampleBean 
		            = (CollectionExampleBean)factory.getBean("exampleBean");
		
		Properties properties = exampleBean.getEmails();
		System.out.println(properties.get("administrator"));
		System.out.println(properties.get("support"));
		System.out.println(properties.get("development"));
		
		List menuList = (List)exampleBean.getMenuList();
		for(int i=0;i<menuList.size();i++){
			System.out.println(menuList.get(i));
		}
		
		Map userIds = exampleBean.getUserIds();
		System.out.println(userIds.get("hong"));
		System.out.println(userIds.get("kim"));
		
		Set subjects = exampleBean.getSubjects();
		Iterator iterator = subjects.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}















