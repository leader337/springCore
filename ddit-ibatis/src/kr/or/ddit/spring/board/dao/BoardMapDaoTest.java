package kr.or.ddit.spring.board.dao;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.spring.board.vo.BoardVo;

import org.apache.log4j.Logger;
import org.springframework.util.Log4jConfigurer;
import org.springframework.util.StopWatch;

public class BoardMapDaoTest {
	protected final Logger logger = Logger.getLogger(this.getClass().getName());
	
	private BoardMapDao boardMapDao;
	
	public BoardMapDaoTest(){
		boardMapDao = new BoardMapDao();
	}
	
	public void testRetrieveList() throws SQLException{
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
			
		List<Map> list = boardMapDao.retriveList(new HashMap());
		
		logger.info(list.size());
		for(Map map:list){
			logger.info(""+map.get("boardId".toUpperCase())+map.get("title".toUpperCase()));
			
		}
		stopWatch.stop();
		logger.info("execute time: "
				+ stopWatch.getTotalTimeMillis() + "ms!!  "
				+ stopWatch.getTotalTimeSeconds() + "s");
	}
	public static void main(String[] args) throws FileNotFoundException{
		Log4jConfigurer.initLogging("classpath:kr/or/ddit/spring/config/log4j.xml");
		
		BoardMapDaoTest boardMapDaoTest = new BoardMapDaoTest();
		
		
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		try {
//			int boardId = boardDaoTest.testCreate();
//			System.out.println("boardId: "+boardId);
			for(int i=0;i<5;i++){
				boardMapDaoTest.testRetrieveList();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
