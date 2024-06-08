public class Main {
    public static void main(String[] args) {

        /*
                //Task 01
        Parent p1 = new A();
        p1.message();
        Parent p2 = new B();
        p2.message();
        */

        /*
                //Task 02
        Bank b1 = new BankA();
        Bank b2 = new BankB();
        Bank b3 = new BankC();
        System.out.println("The balance is of $"+b1.getBalance());
        System.out.println("The balance is of $"+b2.getBalance());
        System.out.println("The balance is of $"+b3.getBalance());
        */

                //Task 03
        /*
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter marks of 1st subject for student A: ");
        double m1 = obj.nextDouble();
        if(m1>0 && m1<=100){
            System.out.println("Enter marks of 2nd subject for student A: ");
            double m2 = obj.nextDouble();
        if(m2>0 && m2<=100){
            System.out.println("Enter marks of 3rd subject for student A: ");
            double m3 = obj.nextDouble();
        if(m3>0 && m3<=100){
            System.out.println("Enter marks of 4th subject for student A: ");
            double m4 = obj.nextDouble();
        if(m4>0 && m4<=100){
            Marks mA = new StudentA(m1, m2, m3, m4);
            System.out.println("The percentage of student A is: "+mA.getPercentage());
                    }
                    else{
                        System.out.println("Invalid Marks");
                    }
                }
                else{
                    System.out.println("Invalid Marks");
                }
            }
            else{
                System.out.println("Invalid Marks");
            }
        }
        else{
            System.out.println("Invalid Marks");
        }
        
        System.out.println("Enter marks of 1st subject for student B: ");
        double M1 = obj.nextDouble();
        if(M1>0 && M1<=100){
            System.out.println("Enter marks of 2nd subject for student B: ");
            double M2 = obj.nextDouble();
            if(M2>0 && M2<100){
                System.out.println("Enter marks of 3rd subject for student B: ");
                double M3 = obj.nextDouble();
                if(M3>0 && M3<=100){
                    Marks mB = new StudentB(M1, M2, M3);
                    System.out.println("The percentage of student B is: "+mB.getPercentage());
                }
                else{
                    System.out.println("Invalid Marks");
                }
            }
            else{
                System.out.println("Invalid Marks");
            }
        }
        else{
            System.out.println("Invalid Marks");
        }
        
        obj.close();
        */

                //Task 04
        /*
        Task4AbstractClass t = new SubClass();
        t.a_method();
        t.non_abstract_method();
        */

                //Task 05
        /*
        Animals a1 = new Cats();
        Animals a2 = new Dogs();
        a1.cats();
        a1.dogs();  //No output because a1 contains Cats and in Cats class dogs method body is empty because cat does not barks
        a2.cats();  //No output because a2 contains Dogs and in Dogs class cats method body is empty because dog does not meows
        a2.dogs();
        */

                //Task 06
        /*
        Ball b1 = new Baseball("ABCD");
        Ball b2 = new Football("WXYZ");
        System.out.println("Brand name for baseball: "+b1.getBrandName());
        System.out.println("Brand name for football: "+b2.getBrandName());
        b1.bounce();
        b1.toss();
        b2.bounce();
        b2.toss();
        */
        
                //Task 07
        
        Qm queue = new Qm();
        queue.add(2);
        queue.add(6);
        queue.add(11);
        queue.add(9);
        queue.add(7);
        queue.remove();
        queue.check();
        
    }
}