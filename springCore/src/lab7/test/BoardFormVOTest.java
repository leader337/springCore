package lab7.test;

import lab7.BoardFormVO;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BoardFormVOTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"lab7/beans.xml"});
		
		BeanFactory factory = context;		
		
		BoardFormVO boardFormVO = (BoardFormVO)factory.getBean("boardFormVO");
		
		System.out.println(boardFormVO.getBoardVO().getTitle());
		System.out.println(boardFormVO.getBoardVO().getContents());
	}

}
