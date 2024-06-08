public class ChessBoard {
    private ChessPiece[][] board;

    ChessBoard(){
        initializeBoard();
    }

    private void initializeBoard(){
        board = new ChessPiece[8][8];

        for (int j=0; j<8; j++){
            board[1][j] = new ChessPiece("Pawn", "Black", 'P');
            board[6][j] = new ChessPiece("Pawn", "White", 'p');
        }
    }
    
    public void display(){
        System.out.println("  a b c d e f g h");
        for (int j=0; j<8; j++){
            System.out.print((8-j) + " ");
            for (int k = 0; k<8; k++){
                if (board[j][k]==null) {
                    System.out.print(". ");
                }
                else{
                    System.out.print(" "+board[j][k].getSymbol());
                }
            }
            System.out.println(8-j);
        }
        System.out.println("  a b c d e f g h");
    }

    public boolean movePiece(String source, String destination){
        int sourceRow= 8 - Character.getNumericValue(source.charAt(1));
        int sourceCol= source.charAt(0)-'a';
        int destRow= 8 - Character.getNumericValue(destination.charAt(1));
        int destCol= destination.charAt(0)-'a';

    if (sourceRow < 0 || sourceRow > 7 || sourceCol < 0 || sourceCol > 7 || destRow < 0 || destRow > 7 || destCol < 0 || destCol > 7){
            System.out.println("Invalid Move");
            return false;
        }

        if (board[sourceRow][sourceCol]==null) {
            System.out.println("No piece at Source");
            return false;
        }

        if (board[destRow][destCol]!= null) {
            System.out.println("Destination position is already Occupied.");
            return false;
        }

        int rowDiff = Math.abs(destRow - sourceRow);
        int colDiff = Math.abs(destCol - sourceCol);
        ChessPiece piece = board[sourceRow][sourceCol];

        if ((rowDiff==2 && colDiff==1) || (rowDiff==1 && colDiff==2)){
            board[destRow][destCol]=piece;
            board[sourceRow][sourceCol]=null;
            return true;
        }
        else if(piece.getName().equals("Pawn")){
            if((piece.getColor().equals("White") && sourceRow==6 && rowDiff<=2 && colDiff==0) || (piece.getColor().equals("Black") && sourceRow==1 && rowDiff<=2 && colDiff==0)){
                board[destRow][destCol]=piece;
                board[sourceRow][sourceCol]=null;
                return true;
            }
            else{
                System.out.println("Invalid Move");
                return false;
            }
        }
        else {
            System.out.println("Invalid Move");
            return false;
        }
    }
    
}