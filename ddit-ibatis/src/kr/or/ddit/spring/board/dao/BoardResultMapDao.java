package kr.or.ddit.spring.board.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.spring.board.vo.BoardVo;
import kr.or.ddit.spring.config.SqlMapConfig;

import com.ibatis.sqlmap.client.SqlMapClient;

public class BoardResultMapDao {
	private SqlMapClient sqlMapClient;
	
	public BoardResultMapDao(){
		sqlMapClient = SqlMapConfig.getSqlMapClient();
	}
	
	public List<BoardVo> retriveList(BoardVo searchBoardVo) throws SQLException{
		return sqlMapClient.queryForList("board-resultMap.retrieveList", searchBoardVo);
	}
	
	
}
