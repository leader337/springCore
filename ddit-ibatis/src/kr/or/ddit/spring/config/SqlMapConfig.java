package kr.or.ddit.spring.config;

import java.io.IOException;
import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class SqlMapConfig {
	/**
	   * SqlMapClient instances are thread safe, so you only need one.
	   * In this case, we'll use a static singleton.  So sue me.  ;-)
	   */
	  private static SqlMapClient sqlMapper;

	  /**
	   * It's not a good idea to put code that can fail in a class initializer,
	   * but for sake of argument, here's how you configure an SQL Map.
	   */
	  static {
	    try {
	      Reader reader = Resources.getResourceAsReader("kr/or/ddit/spring/config/SqlMapConfig.xml");
	      sqlMapper = SqlMapClientBuilder.buildSqlMapClient(reader);
	      reader.close(); 
	    } catch (IOException e) {
	      // Fail fast.
	      throw new RuntimeException("Something bad happened while building the SqlMapClient instance." + e, e);
	    }
	  }
	  
	  public static SqlMapClient getSqlMapClient(){
		  return sqlMapper;
	  }
}
