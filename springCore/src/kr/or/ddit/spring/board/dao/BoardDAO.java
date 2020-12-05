package kr.or.ddit.spring.board.dao;

import java.util.ArrayList;
import java.util.List;

import kr.or.ddit.spring.board.vo.BoardVO;

import org.springframework.stereotype.Repository;

@Repository("boardDAO")
public class BoardDAO {
	private List<BoardVO> list = new ArrayList<BoardVO>();
	
	public List<BoardVO> retrieveList(BoardVO boardVO){
		return list;
	}
	
	public int insert(BoardVO boardVO){
		list.add(boardVO);
		return boardVO.getBoardSn(); 
	}
	
	public int update(BoardVO boardVO) throws Exception{
		int cnt = 0;
		int index = list.indexOf(boardVO);
		if(index >-1){
			BoardVO findBoardVO = list.get(index);
			findBoardVO.setTitle(boardVO.getTitle());
			findBoardVO.setContents(boardVO.getContents());
			
			throw new Exception("예외테스트");
		}
		
		
		return cnt;
	}
	
	public int delete(BoardVO boardVO){
		int cnt = 0;
		boolean isDelete = list.remove(boardVO);
		if(isDelete){
			cnt++;
		}
		return cnt;
	}
	
	public BoardVO retrieve(BoardVO boardVO){
		BoardVO findBoardVO = null;
		int index = list.indexOf(boardVO);
		if(index >-1){
			findBoardVO = list.get(index);
		}
		return findBoardVO;
	}	
	
	
	
	
	
	
	
	
	
}
