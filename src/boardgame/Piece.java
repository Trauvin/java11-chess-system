package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // the initial position of piece is null
	}

	protected Board getBoard() {
		return board;
	}
	
}
