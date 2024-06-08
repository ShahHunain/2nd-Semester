import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        
        System.out.println("\n23k3032\nShah Hunain\n");
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter roller coaster details:");
        System.out.print("Name (of the attraction- some creative name): ");
        String name = obj.nextLine();
        System.out.print("Height (maximum height that the roller coaster can reach): ");
        int height = obj.nextInt();
        obj.nextLine();
        System.out.print("Length (total length of the roller coaster track): ");
        int length = obj.nextInt();
        obj.nextLine();
        System.out.print("Speed: ");
        int speed = obj.nextInt();
        obj.nextLine();
        System.out.print("Capacity (amount of people that can be seated at once): ");
        int capacity = obj.nextInt();
        obj.nextLine();
        System.out.print("Current number of riders (number of passengers/riders currently seated in the roller coaster): ");
        int riders = obj.nextInt();
        obj.nextLine();
        System.out.print("Is ride in progress? (1=Yes\n0=No): ");
        boolean inProgress = obj.nextInt() == 1;

        Park theme = new Park(name, height, length, speed, capacity, riders, inProgress);
        theme.load();
        theme.start();
        theme.stop();
        theme.unload();
        theme.accelerate();
        theme.brakes();

    }
}