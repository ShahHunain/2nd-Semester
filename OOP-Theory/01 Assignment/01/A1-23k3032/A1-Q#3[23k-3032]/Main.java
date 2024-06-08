public class Main {
    public static void main(String[] args) {

    System.out.println("\n\t23k-3032\n\tShah Hunain");

    ChessBoard chessBoard = new ChessBoard();
    
    System.out.println("Initial state:");
    chessBoard.display();

    boolean isValidMove1 = chessBoard.movePiece("b8", "a6");
    System.out.println("Valid?   "+isValidMove1);
    
    System.out.println("After moving knight from b8 to a6:\n");
    chessBoard.display();
    
    boolean isValidMove2 = chessBoard.movePiece("g7", "g5");
    System.out.println("Valid?   "+isValidMove2);
    
    System.out.println("State after moving pawn from g7 to g5:\n");
    chessBoard.display();
    }
}
