import java.util.Scanner;

public class Task04Students{
    String studentId;
    String name;
    final int[] grades = new int[4];

    Task04Students(){
        this.studentId="null";
        this.name="null";
    }

    Task04Students(String id, String n){
        this.studentId=id;
        this.name=n;
    }

    Scanner obj = new Scanner(System.in);

    public void displayDetails(){
        System.out.println("\nStudent Id: "+this.studentId);
        System.out.println("Name: "+this.name);
        addGrades();
    }

    public void addGrades(){
        System.out.println("Enter the marks obtained in the subjects: ");
        for(int i=0; i<4; i++){
            grades[i]=obj.nextInt();
        }
        calculateAverageGrade();
    }

    public void calculateAverageGrade(){
        double total = 0.0;
        for (int i=0; i<4; i++){
            total += grades[i];
        }
        System.out.println("The total marks obtained are: "+total);
        final double avg= total/4;
        System.out.println("The average of marks obtained is: "+avg);
    }

}
