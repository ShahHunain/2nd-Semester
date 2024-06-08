import java.util.ArrayList;

public class University {
    
    String name;
    ArrayList<Department> departments = new ArrayList<>();

    University(String name, ArrayList<Department> departments) {
        this.name = name;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }

    public void addDepartment(Department d){
        departments.add(d);
        System.out.println("Department added");
    }

    public void removeDepartment(Department d){
        boolean found = false;
        for(Department D : departments){
            if(D.name.equals(d.name)){
                departments.remove(d);
                System.out.println("Department removed");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Tata bye bye");
        }
    }

    public void displayDepartments(){
        for(Department d: departments){
            System.out.println("Name: "+this.name);
            System.out.println(d.name);
        }
    }

}