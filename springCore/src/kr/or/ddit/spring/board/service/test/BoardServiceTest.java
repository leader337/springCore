package kr.or.ddit.spring.board.service.test;

import java.util.List;

import kr.or.ddit.spring.board.service.BoardService;
import kr.or.ddit.spring.board.vo.BoardVO;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BoardServiceTest {
private BoardService boardService;
	
	public BoardServiceTest(){
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				new String[]{"kr/or/ddit/spring/config/beans-annotation.xml"});
		
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				new String[]{"kr/or/ddit/spring/config/beans-aop4XML.xml"});
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"kr/or/ddit/spring/config/beans-aop4Aspect.xml"});
		
		
		BeanFactory factory = context;
		
		this.boardService = (BoardService)factory.getBean("boardService");
		
		for(int i=0;i<5;i++){
			BoardVO boardVO = new BoardVO();
			boardVO.setBoardSn(i+1);
			boardVO.setTitle((i+1)+" 번째 제목");
			boardVO.setContents((i+1)+" 번째 내용");
			
			boardService.insert(boardVO);
		}
	}
	
	public void testRetrieveList(){
		List<BoardVO> list = boardService.retrieveList(new BoardVO());
		System.out.println("list.size(): "+list.size());
		for(BoardVO listBoardVO:list){
			System.out.println(listBoardVO);
		}
	}
	
	public void testInsert(){
		BoardVO boardVO = new BoardVO();
		boardVO.setBoardSn(99);
		boardVO.setTitle("추가된 99 제목");
		boardVO.setContents("추가된 99 내용");
		
		boardService.insert(boardVO);
	}
	
	public void testUpdate() throws Exception{
		BoardVO boardVO = new BoardVO();
		boardVO.setBoardSn(99);
		boardVO.setTitle("변경된 99 제목");
		boardVO.setContents("변경된 99 내용");
		
		boardService.update(boardVO);
	}
	
	public void testDelete(){
		BoardVO boardVO = new BoardVO();
		boardVO.setBoardSn(99);
		
		boardService.delete(boardVO);
	}
	
	public void testRetrieve(){
		BoardVO boardVO = new BoardVO();
		boardVO.setBoardSn(99);
		
		BoardVO findBoardVO = boardService.retrieve(boardVO);
		System.out.println(findBoardVO);
	}
	
	public static void main(String[] args) {
		BoardServiceTest boardServiceTest = new BoardServiceTest();
		boardServiceTest.testRetrieveList();
		boardServiceTest.testInsert();
//		boardServiceTest.testRetrieveList();
		try {
			boardServiceTest.testUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
//		boardServiceTest.testRetrieve();
//		boardServiceTest.testRetrieveList();
		boardServiceTest.testDelete();
		boardServiceTest.testRetrieveList();
	}
}
