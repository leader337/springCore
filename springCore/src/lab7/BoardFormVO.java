package lab7;

public class BoardFormVO {
	
	private BoardVO boardVO;
	
	private int a=0;
	private int b;
	
	private Integer c;
	private String d;
	
	public BoardFormVO(){
		boardVO = new BoardVO();
	}

	public BoardVO getBoardVO() {
		return boardVO;
	}

	public void setBoardVO(BoardVO boardVO) {
		this.boardVO = boardVO;
	}
	
	
	
	@Override
	public String toString() {
		return "BoardFormVO [a=" + a + ", b=" + b+", c="+c+", d="+d
				+ "]";
	}

	public static void main(String[] args) {
		BoardFormVO boardFormVO = new BoardFormVO();
		System.out.println(boardFormVO);
	}
}
