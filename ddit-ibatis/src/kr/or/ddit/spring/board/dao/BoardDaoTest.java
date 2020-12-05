package kr.or.ddit.spring.board.dao;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.util.Log4jConfigurer;
import org.springframework.util.StopWatch;

import kr.or.ddit.spring.board.vo.BoardVo;
public class BoardDaoTest {
	protected final Logger logger = Logger.getLogger(this.getClass().getName());
	
	private BoardDao boardDao;
	
	public BoardDaoTest(){
		boardDao = new BoardDao();
	}
	
	public void testRetrieveList() throws SQLException{
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		BoardVo searchBoardVo = new BoardVo();
		
		List<BoardVo> list = boardDao.retriveList(searchBoardVo);
		logger.info(list.size());
		for(BoardVo boardVo:list){
			logger.info(boardVo);
		}
		stopWatch.stop();
		logger.info("execute time: "
				+ stopWatch.getTotalTimeMillis() + "ms!!  "
				+ stopWatch.getTotalTimeSeconds() + "s");
	}
	
	public int testCreate() throws SQLException{
		BoardVo boardVo = new BoardVo();
		boardVo.setTitle("test 제목입니다.");
		boardVo.setContents("test 내용입니다.");
		boardVo.setWriter("테스터");
		return boardDao.create(boardVo);
	}
	
	public void testUpdate() throws SQLException{
		BoardVo boardVo = new BoardVo();
		boardVo.setBoardId(1);
		boardVo.setTitle("test 제목 수정입니다.");
		boardVo.setContents("test 내용 수정입니다.");
		boardVo.setWriter("수정자");
		boardDao.update(boardVo);
	}
	
	public void testDelete() throws SQLException{
		BoardVo boardVo = new BoardVo();
		boardVo.setBoardId(1);
		
		logger.info(boardDao.delete(boardVo));
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		
		Log4jConfigurer.initLogging("classpath:kr/or/ddit/spring/config/log4j.xml");
		BoardDaoTest boardDaoTest = new BoardDaoTest();
		
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		try {
			int boardId = boardDaoTest.testCreate();
			System.out.println("boardId: "+boardId);
			
			
			boardDaoTest.testRetrieveList();
			
			boardDaoTest.testUpdate();
			boardDaoTest.testRetrieveList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
