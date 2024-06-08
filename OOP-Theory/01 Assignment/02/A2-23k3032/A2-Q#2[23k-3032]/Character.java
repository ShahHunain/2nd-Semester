import java.util.Scanner;
public class Character extends Player {
    protected int level;
    protected String experience;
    protected int points;

    Character(){
        super();
        this.level=0;
        this.points=0;
        this.experience="Beginner";
    }

    Character(int level, String experience, int points){
        this.level=level;
        this.experience=experience;
        this.points=points;
    }

    Scanner obj = new Scanner(System.in);

    public void levelUp(){
        System.out.println(experience+" experience");
        System.out.println(points+" points");
            if(this.experience.equals("Beginner")){
                this.experience="Intermediate";
            }
            else if(this.experience.equals("Intermediate")){
                this.experience="Advanced";
            }
            else if(this.experience.equals("Advanced")){
                this.experience="Expert";
            }
    }

    public void playGame(Weapons weapons, Enemy enemy){
        weapons.use();
        if(weapons.j==1){
            System.out.println("Attack?\n1=Yes\t2=No");
            int choice = obj.nextInt();
            obj.nextLine();
            if(choice==1){
                System.out.println("ATTACK DONE");
                enemy.health=enemy.health-5;
                points=points+10;
                levelUp();
            }
        }
    }

}