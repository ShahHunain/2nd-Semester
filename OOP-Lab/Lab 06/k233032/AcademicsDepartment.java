public class AcademicsDepartment {
    private String name;
    private String[] facultyMembers;
    private String[] coursesOffered;

    AcademicsDepartment(){
        this.name="null";
    }

    AcademicsDepartment(String n, String[] facultyMembers, String[] coursesOffered){
        this.name=n;
        this.facultyMembers=facultyMembers;
        this.coursesOffered=coursesOffered;
    }

    public String getName(){
        return this.name;
    }

    public String[] getFacultyMembers(){
        return facultyMembers;
    }

    public String[] getCousesOffered(){
        return coursesOffered;
    }

    public void scheduleClasses(){
        System.out.println("Classes scheduled for "+name);
    }

    public void manageResources(){
        System.out.println("Resources Mangaged for: "+name);
    }

}
