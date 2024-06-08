import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        
        Student s1 = new Student(1,"Usman");
        Student s2 = new Student(2,"Faraz");
        Student s3 = new Student(3, "Mustafa");

        Student s4 = new Student(1,"Keyan");
        Student s5 = new Student(2,"Urooj");

        ArrayList<Student> students1 = new ArrayList<>();
        students1.add(s1);
        students1.add(s2);
        students1.add(s3);

        ArrayList<Student> students2 = new ArrayList<>();
        students2.add(s4);
        students2.add(s5);
        
        Department d1 = new Department("Software", students1);
        Department d2 = new Department("Electrical", students2);
        ArrayList<Department> departments = new ArrayList<>();
        departments.add(d1);
        departments.add(d2);

        University u = new University("Bahria University", departments);
        
        d1.displayStudents();
        u.displayDepartments();

        
        d1.addStudents(s5);
        System.out.println("After adding");
        d1.displayStudents();

        d1.removeStudent(s5);
        System.out.println("After removing");
        d1.displayStudents();


    }
}