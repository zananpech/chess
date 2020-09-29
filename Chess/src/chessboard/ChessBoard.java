package chessboard;
import chesspiece.*;

public class ChessBoard {
	Object [][] board = new Object[8][8];
	
	
	
	public Object addPiece(ChessPiece piece) {
		int row = piece.getRow();
		int col = piece.getCol();
		if(row > 0 && row <= 8 && col >0 && col <=8)
			if(board[row][col] == null)
				return board[row][col] = piece;
			else 
				return null;
				//System.out.println("This loc has been occupied");
		return board[row][col] = piece;
	}
	
	public void printBoard(ChessPiece piece) {
		int row = piece.getRow();
		int col = piece.getCol();
		//System.out.println(board[row][col]);
	}
}
