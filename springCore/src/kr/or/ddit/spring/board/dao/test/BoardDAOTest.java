package kr.or.ddit.spring.board.dao.test;

import java.util.List;

import kr.or.ddit.spring.board.dao.BoardDAO;
import kr.or.ddit.spring.board.vo.BoardVO;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BoardDAOTest {
	
	private BoardDAO boardDAO;
	
	public BoardDAOTest(){
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"kr/or/ddit/spring/config/beans-annotation.xml"});
		
		BeanFactory factory = context;
		
		this.boardDAO = (BoardDAO)factory.getBean("boardDAO");
		
		for(int i=0;i<5;i++){
			BoardVO boardVO = new BoardVO();
			boardVO.setBoardSn(i+1);
			boardVO.setTitle((i+1)+" 번째 제목");
			boardVO.setContents((i+1)+" 번째 내용");
			
			boardDAO.insert(boardVO);
		}
	}
	
	public void testRetrieveList(){
		List<BoardVO> list = boardDAO.retrieveList(new BoardVO());
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
		
		boardDAO.insert(boardVO);
	}
	
	public void testUpdate() throws Exception{
		BoardVO boardVO = new BoardVO();
		boardVO.setBoardSn(99);
		boardVO.setTitle("변경된 99 제목");
		boardVO.setContents("변경된 99 내용");
		
		boardDAO.update(boardVO);
	}
	
	public void testDelete(){
		BoardVO boardVO = new BoardVO();
		boardVO.setBoardSn(99);
		
		boardDAO.delete(boardVO);
	}
	
	public void testRetrieve(){
		BoardVO boardVO = new BoardVO();
		boardVO.setBoardSn(99);
		
		BoardVO findBoardVO = boardDAO.retrieve(boardVO);
		System.out.println(findBoardVO);
	}
	
	public static void main(String[] args) {
		BoardDAOTest boardDAOTest = new BoardDAOTest();
		boardDAOTest.testRetrieveList();
		boardDAOTest.testInsert();
		boardDAOTest.testRetrieveList();
		try {
			boardDAOTest.testUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boardDAOTest.testRetrieve();
//		boardDAOTest.testRetrieveList();
		boardDAOTest.testDelete();
		boardDAOTest.testRetrieveList();
	}
	
	
	
	
	
	
	
	
	
	
}
