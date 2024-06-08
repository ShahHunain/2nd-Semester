import java.util.ArrayList;
import java.util.Scanner;

public class GamingEnvironment{
    public static void main(String[] args) {
        
        System.out.println("\n---------------Shah Hunain (23k-3032)---------------");
        Scanner obj = new Scanner(System.in);
            ArrayList<String> weapons = new ArrayList<>();

            System.out.println("Enter the weapons");
            for(int i=0; ; i++){
                if(i>4){
                    System.out.println("You want to enter more?\nY=YES\t\tN=NO");
                    String choice = obj.nextLine();
                    if(choice.equals("N")){
                        break;
                    }
                }
                System.out.println("Enter weapon "+(i+1));
                String n = obj.nextLine();
                weapons.add(n);
                
            }
            
            System.out.println("Enter damage for Enemy (1-10): ");
            int damage = obj.nextInt();
            obj.nextLine();
            if (damage<1 || damage>10){
                System.out.println("Invalid Damage value");
                damage=5;     //Sett to default
            }

            Player p = new Player(1, "Avenger");
            Weapons w = new Weapons(weapons);
            Character c = new Character();
            Enemy e = new Enemy(damage);
            
            for (int i = 0; i<3; i++){
                System.out.println("Experience level: "+c.experience);
                c.playGame(w,e);
                System.out.println("Experience Updated to "+c.experience);
            }
            System.out.println("Player ID: "+p.playerId+"\nPlayer Name: "+p.playerName);
            System.out.println("Final Experience level: "+c.experience);
    }
}