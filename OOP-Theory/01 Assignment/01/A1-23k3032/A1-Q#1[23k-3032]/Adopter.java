import java.util.ArrayList;

public class Adopter {
    private String adopterName;
    private String adopterMobileNum;
    private ArrayList<Pet> adoptedPetRecords;

    public Adopter(String adopterName, String adopterMobileNum) {
        this.adopterName = adopterName;
        this.adopterMobileNum = adopterMobileNum;
        this.adoptedPetRecords = new ArrayList<>();
    }

    public void adoptPet(Pet pet) {
        adoptedPetRecords.add(pet);
        System.out.println("Pet adopted successfully!");
    }

    public void returnPet(Pet pet) {
        adoptedPetRecords.remove(pet);
        System.out.println("Pet returned successfully!");
    }

    public void displayAdoptedPets() {
        System.out.println("Adopted Pets:");
        for (Pet pet : adoptedPetRecords) {
            pet.displayPetDetails();
        }
    }
}
