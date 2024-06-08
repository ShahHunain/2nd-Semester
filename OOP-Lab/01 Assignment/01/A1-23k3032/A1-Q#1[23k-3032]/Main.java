import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        
    System.out.println("\n\t23k-3032\n\tShah Hunain");

    ArrayList<String> skills1 = new ArrayList<>();
    skills1.add("Fishing");
    skills1.add("Acting");
    Pet pet1 = new Pet("Healthy",6,9,skills1);

    ArrayList<String> skills2 = new ArrayList<>();
    skills2.add("Responding");
    skills2.add("Skating");
    Pet pet2 = new Pet("Sick",5,8,skills2);

    Adopter adopter1 = new Adopter("Ali","01234567890");
    Adopter adopter2 = new Adopter("Ahmed","01231231230");

    adopter1.adoptPet(pet1);
    adopter2.adoptPet(pet2);

    adopter1.displayAdoptedPets();
    adopter2.displayAdoptedPets();

    pet1.updateHappiness(-3);
    pet1.updateHealth("Sick");
    pet1.updateHunger(2);
    pet1.displayPetDetails();

    pet2.updateHappiness(2);
    pet2.updateHealth("Healthy");
    pet2.updateHunger(-3);
    pet2.displayPetDetails();

    adopter1.returnPet(pet1);
    adopter2.returnPet(pet2);

    }
}