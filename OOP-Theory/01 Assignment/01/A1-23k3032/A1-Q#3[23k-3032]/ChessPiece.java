public class ChessPiece {
    private String name;
    private String color;
    private char symbol;

    ChessPiece(){
        this.name="Pawn";
        this.color="White";
        this.symbol='p';
    }

    ChessPiece(String name, String color, char symbol){
        this.name=name;
        this.color=color;
        this.symbol=symbol;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public char getSymbol(){
        return symbol;
    }

    public void setSymbol(char symbol){
        this.symbol=symbol;
    }
}
