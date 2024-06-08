import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        /*
                //Task 01

        Job j = new Job();
        j.setRole("Manager");
        j.setId(01);
        j.setSalary(100000.99);

        Person p = new Person(j);
        System.out.println("Salary: "+p.getJob().getSalary());
        */

        /*
                //Task 02
        
            CPU c = new CPU();
            CPU.Processor cp = c.new Processor();
            System.out.println("Cache: "+cp.getCache());

            CPU.RAM cr = c.new RAM();
            System.out.println("Clock Speed: "+cr.getClockSpeed());
        */

        /*
                //Task 03
        
            Car c1 = new Car("Mehran", "4T");
            Car c2 = new Car("Alto", "4T");
            Car c3 = new Car("Civic", "5T");

            Engine e1 = new Engine();
            e1.setEngine(c1);
            System.out.println("Engine Type: "+e1.getEngineType());

            Engine e2 = new Engine();
            e2.setEngine(c2);
            System.out.println("Engine Type: "+e2.getEngineType());

            Engine e3 = new Engine();
            e3.setEngine(c3);
            System.out.println("Engine Type: "+e3.getEngineType());
        */


                //Task 04
        /*
        try {
            int[] marks = {19,10,13,17};
            marks[4]=marks[4]+1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bound exception occured (actual size of array is four)");
        }
        */

        /*
                //Task 05
        Scanner obj = new Scanner(System.in);
        double[] marks = new double[5];
        double totalMarks = 0;
    
        for (int i=0; i<5; i++){
            System.out.print("Enter marks for "+(i+1)+" subject: ");
                try {
                    marks[i]=obj.nextDouble();
                    totalMarks=totalMarks+marks[i];
                } catch (Exception e) {
                    System.out.println("Invalid input. You should enter a double value");
                    obj.nextLine();
                    i--;
                    }
                }

                System.out.print("Enter total marks: ");
                double total;
                try {
                    total=obj.nextDouble();
                } catch (Exception e) {
                    System.out.println("Invalid input for total marks. You should enter an double value");
                    return;
                }
        
                double percentage = (totalMarks/total)*100;
                System.out.println("Percentage: "+percentage+"%");
        */


                //Task 06

            Scanner obj = new Scanner(System.in);
            boolean correct = false;
            int n1 = 0, n2 = 0, answer = 0;
        
            try {
                System.out.println("Enter first number: ");
                n1 = obj.nextInt();
                try {
                    System.out.println("Enter the second number: ");
                    n2 = obj.nextInt();
                    answer = n1 / n2;
                    correct = true;
                } catch (ArithmeticException e) {
                    System.out.println("Arithmetic Exception occurred: Division by zero");
                } catch (Exception e) {
                    System.out.println("You should enter an integer number");
                    }
                } catch (Exception e) {
                    System.out.println("You should enter an integer number");
                } finally {
                    if (correct)
                        System.out.println("The number " + n1 + " when divided by " + n2 + " gives " + answer);
                }

    }
}