package kr.or.ddit.spring.board.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.ddit.spring.config.SqlMapConfig;

import com.ibatis.sqlmap.client.SqlMapClient;

public class BoardMapDao {
    private SqlMapClient sqlMapClient;
	
	public BoardMapDao(){
		sqlMapClient = SqlMapConfig.getSqlMapClient();
	}
	
	public List<Map> retriveList(Map map) throws SQLException{
		return sqlMapClient.queryForList("board-map.retrieveList", map);
	}
}
