public class Player {
    protected int playerId;
    protected String playerName;
    protected int health;

    Player(){

    }

    Player(int playerId, String playerName){
        this.playerId=playerId;
        this.playerName=playerName;
        this.health=100;
    }

}