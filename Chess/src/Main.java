import chesspiece.*;
import chessboard.*;

public class Main {
	
	public static void main(String args[]) {
		
		Pawn testpawn = new Pawn();
		King testking = new King();
		testpawn.setRow(1);
		testpawn.setCol(1);
		testking.setRow(1);
		testking.setCol(1);
		ChessBoard board = new ChessBoard();
		System.out.println(board.addPiece(testpawn));
		System.out.println(board.addPiece(testking));
		
		
		//board.printBoard(testpawn);
		//board.printBoard(testking);
	}
}
