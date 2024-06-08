import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        
                //Task 01
        /*
            FullTimeEmployee fe = new FullTimeEmployee();
            fe.input();
            fe.display();
            fe.incrementSalary();
            System.out.println("The incremented salary is: "+fe.getIncrementedSalary());

            PartTimeEmployee pe = new PartTimeEmployee();
            pe.input();
            pe.display();
            pe.incrementSalary();
            System.out.println("The incremented salary is: "+pe.getIncrementedSalary());
        */
        

                //Task 02
    /*
        FourWheeler fw1 = new FourWheeler("Lambo", 123123456, 4, false);
        fw1.accelerate(80);
        fw1.display();

        FourWheeler fw2 = new FourWheeler("Jet-Phi", 789753951, 4, true);
        fw2.accelerate(80);
        fw2.display();
    */
    
                //Task 03
    /*
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the x co-ordinate: ");
        int x = obj.nextInt();
        System.out.println("Enter the y co-ordinate: ");
        int y = obj.nextInt();
        System.out.println("Enter the direction: ");
        obj.nextLine();
        String direction = obj.nextLine();
        

        MovingRobot mr = new MovingRobot(direction, x, y);
        System.out.println("Enter the number of steps to move: ");
        int n = obj.nextInt();
        if(n>=0){
            mr.moveRobot(n);
        }
        else{
            System.out.println("Steps can not be negative");
        }
        mr.display();
    */

                //Task 04
    /*
        SavingAccount sa = new SavingAccount(75000);
        sa.setTimeSpan(12);
        sa.calculateInterest();
        sa.credit();
    */

                //Task 05

        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter two numbers: ");
        int a = obj.nextInt();
        int b = obj.nextInt();

        System.out.println("Enter array size: ");
        int n = obj.nextInt();
        System.out.println("Enter the array elements: ");
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i]=obj.nextInt();
        }

        Adder.add(a, b);
        Adder.add(array);

    }
}