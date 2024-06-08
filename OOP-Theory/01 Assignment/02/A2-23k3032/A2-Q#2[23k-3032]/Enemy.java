import java.util.Scanner;

public class Enemy extends Player{
    protected int damage;
    
    Enemy(){
        super();
    }

    Enemy(int damage){
        this.damage=damage;
    }

    Scanner obj = new Scanner(System.in);

    public void attack(Weapons weapons){
        weapons.use();
        if(weapons.j==1){
            System.out.println("Enemy Attacks");
            health=health-this.damage;
        }
    }

}