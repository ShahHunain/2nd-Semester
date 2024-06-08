public class Main{
    public static void main(String [] args){


            //Task 01
    /*  Students[] s = new Students[5];

        double[] mark1={55.5,65.5,75.5,85.5,95.5};
        double[] mark2={35.5,45.5,25.5,10.5,100};
        double[] mark3={45,60,70,83,99};
        double[] mark4={90,91,85.75,91.25,100};
        double[] mark5={33,27,55,60,80};
        s[0]=new Students("23k-100","Ali",mark1);
        s[1]=new Students("23k-101","Ahmed",mark2);
        s[2]=new Students("23k-102","Zohair",mark3);
        s[3]=new Students("23k-103","Saqib",mark4);
        s[4]=new Students("23k-104","Awais",mark5);

        s[0].getAverage();
        s[1].getAverage();
        s[2].getAverage();
        s[3].getAverage();
        s[4].getAverage();
        
        double max=getMaximum(s);
        System.out.println("The maximum average is "+max);
    }
    static double getMaximum(Students[] s){
        double max=s[0].getAverage();
        for(int i=1; i<5 ; i++){
            if(max<s[i].getAverage()){
                max=s[i].getAverage();
            }
        }
        return max;
    */

            // Task 02
    /*    
        Book[] b =new Book[5];

        b[0] = new Book("Treasure Island","Robert Louis Stevenson","Adventure");
        b[1] = new Book("Salvation","Grace Barrows","Crime");
        b[2] = new Book("Prisoner of Zenda","Aurthur Hawkins","Mystery");
        b[3] = new Book("Kidnapped","Charles Dickens","Adventure");
        b[4] = new Book("Frankenstein","James TheHigh","Crime");

        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter the genre you preffer: ");
        String choice =obj.nextLine();

        b[0].getBook(choice);
        b[1].getBook(choice);
        b[2].getBook(choice);
        b[3].getBook(choice);
        b[4].getBook(choice);
    */

            //Task 03
    /*
        BankAccounts[] bA = new BankAccounts[5];
    
        bA[0]= new BankAccounts("AB-10101011",100000.150);
        bA[1]= new BankAccounts("AB-10102022",200000);
        bA[2]= new BankAccounts("AB-10103033",150000);
        bA[3]= new BankAccounts("AB-10104044",150000.50);
        bA[4]= new BankAccounts("AB-10105055",500000.725);

        bA[0].getBankAccounts();
        bA[0].deposit(10000);
        bA[0].withDraw(5000);
        
        bA[1].getBankAccounts();
        bA[1].deposit(2500);
        bA[1].withDraw(700);

        bA[2].getBankAccounts();
        bA[2].deposit(7000);
        bA[2].withDraw(12000);

        bA[3].getBankAccounts();
        bA[3].deposit(30800);
        bA[3].withDraw(1000);

        bA[4].getBankAccounts();
        bA[4].deposit(4000);
        bA[4].withDraw(40000);
    */

            //Task 04
    /*
        Task04Students[] Ts = new Task04Students[5];

        Ts[0] = new Task04Students("23k-1010","Ali");
        Ts[1] = new Task04Students("23k-1011","Ahmed");
        Ts[2] = new Task04Students("23k-1012","Zohaib");

        Ts[0].displayDetails();
        Ts[1].displayDetails();
        Ts[2].displayDetails();
    */

            //Task 05
    /*
        Item item1 = new Item("101A22", "Hammer",10, 500.00);
        Item item2 = new Item("804B11", "Knife", 15, 170);

        InventoryManager.updateInventory("101A22", 5);
        InventoryManager.updateInventory("804B11", -3);

        System.out.println("Updated Inventory:");
        item1.display();
        item2.display();
    */

            //Task 06
    
        Booking b1 = new Booking("AB0123C",01,"A123","D04",false);
        Booking b2 = new Booking("ABC1234",02,"A123","D05",true);
        
        BookingManager.cancelBooking(b1);
        b1.display();
        BookingManager.cancelBooking(b2);
        b2.display();

        b1.finalize();
        b2.finalize();
        System.gc();

        //Sir Minhal Raza said that it is a good practice to use destructors at the end of program to prevent memory leak and also to maintain the memory usage
        //Using destructors in all Qs skipped from my mind earlier
        //I tried to implement everything he has taught us unti now

    }
}