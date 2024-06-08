import java.util.ArrayList;
import java.util.Scanner;

public class Weapons {
    protected ArrayList<String> weaponsList;

    Weapons(ArrayList<String> weaponsList){
        this.weaponsList=weaponsList;
    }

    Scanner obj = new Scanner(System.in);
    
    int j;

    public void use(){
        j=0;       //To check found or not
        System.out.println("Enter the weapon you want to use: ");
        String n = obj.nextLine();
        for(String element: weaponsList){
            if(n.equals(element)){
                System.out.println();
                j=1;     //If found
            }
        }
        if(j==0){
            System.out.println("Weapon not found");
        }
    }


}