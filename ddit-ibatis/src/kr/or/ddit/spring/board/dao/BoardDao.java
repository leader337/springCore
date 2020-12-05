package kr.or.ddit.spring.board.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.spring.board.vo.BoardVo;
import kr.or.ddit.spring.config.SqlMapConfig;

import com.ibatis.sqlmap.client.SqlMapClient;

public class BoardDao {
	private SqlMapClient sqlMapClient;
	
	public BoardDao(){
		sqlMapClient = SqlMapConfig.getSqlMapClient();
	}
	
	public List<BoardVo> retrivePagingList(BoardVo boardVo) throws SQLException{
		return sqlMapClient.queryForList("board.retrivePagingList", boardVo);
	}
	
	public Long retrievePagingCount(BoardVo boardVo) throws SQLException{
		return (Long)sqlMapClient.queryForObject("board.retrievePagingCount", boardVo);
	}
	
	public List<BoardVo> retriveList(BoardVo boardVo) throws SQLException{
		return sqlMapClient.queryForList("board.retrieveList", boardVo);
	}
	
	public int create(BoardVo boardVo) throws SQLException{
		return (Integer)sqlMapClient.insert("board.create", boardVo);
	}
	
	public BoardVo retrive(BoardVo boardVo) throws SQLException{
		return (BoardVo)sqlMapClient.queryForObject("board.retrieve", boardVo);
	}
	
	public int update(BoardVo boardVo) throws SQLException{
		return sqlMapClient.update("board.update", boardVo);
	}
	
	public int delete(BoardVo boardVo) throws SQLException{
		return sqlMapClient.delete("board.delete", boardVo);
	}
}
