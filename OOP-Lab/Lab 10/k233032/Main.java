import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

                // Task 01
        /*
        String[] o = new String[5];
        Scanner obj = new Scanner(System.in);
        System.out.println("\tEnter the elements");
        for (int i=0; i<5; i++){
            System.out.println("Enter "+(i+1)+" element: ");
            o[i]=obj.nextLine();
        }
        File file = new File("Task01.txt");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for(int i=0; i<5; i++)
            bw.write(o[i]+"\n");
            bw.close();
            System.out.println("Data written to file");
            file.delete();
        } catch (IOException e){
            System.out.println("Exception occurred");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        */

                // Task 02
        /*
        try {
            File file = new File("ShahHunain.txt");
            Scanner obj = new Scanner(file);
            while(obj.hasNextLine()){
                String n = obj.nextLine();
                System.out.println(n);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception occurred");
            System.out.println(e);
        }
        */
        
                // Task 03
        /*
        Task03.swap("abc", "def");
        Task03.swap(10, 4);
        */

                // Task 04
        /*
        Task04 t1 = new Task04("shah@gmail.com", "shah123");
        Task04 t2 = new Task04("shah@gmail.com", "abc123");
        Task04 t3 = new Task04("abc@gmail.com", "shah123");
        */

                // Task 05
        
        File file = new File("Confidential.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Exception occurred");
            System.out.println(e);
        }
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the designation: ");
        String designation = obj.nextLine();
        if(designation.equals("Faculty")){
            file.setReadable(true);
            file.setWritable(true);
            file.setExecutable(true);
            showAccessRight(designation,file);
        }else if(designation.equals("Student")){
            file.setReadable(true);
            file.setWritable(false);
            file.setExecutable(false);
            showAccessRight(designation,file);
        }else{
            System.out.println("Match not found");
        }
        
    }

    public static void showAccessRight(String designation, File file){
        System.out.println("\tAccess Rights Status for "+designation);
        System.out.println("Read "+file.canRead());
        System.out.println("Write "+file.canWrite());
        System.out.println("Execute "+file.canExecute());
    }
}