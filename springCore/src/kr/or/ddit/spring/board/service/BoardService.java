package kr.or.ddit.spring.board.service;

import java.util.List;

import javax.annotation.Resource;

import kr.or.ddit.spring.board.dao.BoardDAO;
import kr.or.ddit.spring.board.vo.BoardVO;

import org.springframework.stereotype.Service;

@Service("boardService")
public class BoardService {
	@Resource(name="boardDAO")
	private BoardDAO boardDAO;
	
	public List<BoardVO> retrieveList(BoardVO boardVO){
		return boardDAO.retrieveList(boardVO);
	}
	
	public int insert(BoardVO boardVO){
		return boardDAO.insert(boardVO);
	}
	
	public int update(BoardVO boardVO) throws Exception{
		return boardDAO.update(boardVO);
	}
	
	public int delete(BoardVO boardVO){
		return boardDAO.delete(boardVO);
	}
	
	public BoardVO retrieve(BoardVO boardVO){
		return boardDAO.retrieve(boardVO);
	}	
}
