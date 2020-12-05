package kr.or.ddit.spring.board.vo;

import java.util.Date;

public class BoardVo {
	private int boardId;
	private String title;
	private String contents;
	private String writer;
	private Date createdDate;
	
	private long currentPage;
	private long countPerPage;
	
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public long getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(long currentPage) {
		this.currentPage = currentPage;
	}
	public long getCountPerPage() {
		return countPerPage;
	}
	public void setCountPerPage(long countPerPage) {
		this.countPerPage = countPerPage;
	}
	@Override
	public String toString() {
		return "BoardVo [boardId=" + boardId + ", title=" + title
				+ ", contents=" + contents + ", writer=" + writer
				+ ", createdDate=" + createdDate + "]";
	}
	
	
}
