package kr.or.ddit.spring.board.vo;

import java.util.ArrayList;
import java.util.List;

public class BoardFormVo {
	private BoardVo boardVo;
	private BoardVo searchBoardVo;
	private List<BoardVo> list;
	
	public BoardFormVo(){
		boardVo = new BoardVo();
		searchBoardVo = new BoardVo();
		list = new ArrayList<BoardVo>();
	}

	public BoardVo getBoardVo() {
		return boardVo;
	}

	public void setBoardVo(BoardVo boardVo) {
		this.boardVo = boardVo;
	}

	public BoardVo getSearchBoardVo() {
		return searchBoardVo;
	}

	public void setSearchBoardVo(BoardVo searchBoardVo) {
		this.searchBoardVo = searchBoardVo;
	}

	public List<BoardVo> getList() {
		return list;
	}

	public void setList(List<BoardVo> list) {
		this.list = list;
	}
	
	
}
