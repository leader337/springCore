package kr.or.ddit.spring.board.vo;

public class BoardVO {
	private int boardSn;
	private String title;
	private String contents;
	
	public int getBoardSn() {
		return boardSn;
	}
	public void setBoardSn(int boardSn) {
		this.boardSn = boardSn;
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
	@Override
	public String toString() {
		return "BoardVO [boardSn=" + boardSn + ", title=" + title
				+ ", contents=" + contents + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoardVO other = (BoardVO) obj;
		if (boardSn != other.boardSn)
			return false;
		return true;
	}
	
	
}
