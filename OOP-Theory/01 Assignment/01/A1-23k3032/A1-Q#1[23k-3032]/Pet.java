import java.util.ArrayList;

public class Pet {
    private String healthStatus;
    private int hungerLevel;
    private int happinessLevel;
    private ArrayList<String> specialSkills;

    Pet(String healthStatus, int hungerLevel, int happinessLevel, ArrayList<String> specialSkills){
        this.healthStatus = healthStatus;
        this.hungerLevel = hungerLevel;
        this.happinessLevel = happinessLevel;
        this.specialSkills = specialSkills;
    }

    public void displayPetDetails(){
        System.out.println("Health Status: "+healthStatus);
        System.out.println("Hunger Level: "+hungerLevel);
        System.out.println("Happiness Level: "+happinessLevel);
        System.out.println("Special Skills: "+specialSkills);
    }

    public void updateHappiness(int amount){
        happinessLevel =happinessLevel + amount;
        if (happinessLevel>10){
            happinessLevel=10;
        }
        else if(happinessLevel<0){
            happinessLevel=0;
        }
    }

    public void updateHealth(String newHealthStatus){
        healthStatus = newHealthStatus;
    }

    public void updateHunger(int amount){
        hungerLevel =hungerLevel + amount;
        if (hungerLevel > 10){
            hungerLevel = 10;
        }
        else if(hungerLevel<0){
            hungerLevel = 0;
        }
        else{

        }

        if(amount<0){
            updateHappiness(1);
        }
        else if(amount>0){
            updateHappiness(-1);
        }
        else{

        }
    }
}
