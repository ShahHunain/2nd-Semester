public class CollectionOfPets{
    public static void main(String[] args) {
        
        System.out.println("\n--------Shah Hunain(23K-3032)--------\n");

        Cat<String,Integer> c = new Cat<String,Integer>("Dora", 5);
        Dog<String,Integer> d = new Dog<String,Integer>("Tommy", 7);
        Bird<String,Integer> b = new Bird<String,Integer>("Humming", 2);

        c.printDetails();
        c.makeSound();
        System.out.println();

        d.printDetails();
        d.makeSound();
        System.out.println();
        
        b.printDetails();
        b.makeSound();
        System.out.println();
        
    }
}