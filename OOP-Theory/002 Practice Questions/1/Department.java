import java.util.ArrayList;

public class Department {
    
    String name;
    ArrayList<Student> students;
    
    Department(String n, ArrayList<Student> students){
        this.name=n;
        this.students= new ArrayList<>();
        this.students=students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudents(Student s){
        students.add(s);
        System.out.println("Student added");
    }

    public void removeStudent(Student s){
        boolean found = false;
        for(Student S : students){
            if(s.id==S.id){
                students.remove(s);
                System.out.println("Student removed");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Tata bye bye");
        }
    }

    public void displayStudents(){
        for(Student s: students){
            System.out.println("Id: "+s.id);
            System.out.println("Name: "+s.name);
        }
    }

}