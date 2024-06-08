class EmployHiring {
    int id;
    String name;
    String designation;
    double salary;

    public EmployHiring() {
        this.id = 0;
        this.name = "null";
        this.designation = "null";
        this.salary = 0.0;
        System.out.println("Default Constructor made!");
    }

    public EmployHiring(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        System.out.println("Parameterized Constructor made!");
    }

    public EmployHiring(EmployHiring pe) {
        this.id = pe.id;
        this.name = pe.name;
        this.designation = pe.designation;
        this.salary = pe.salary;
        System.out.println("Copy Constructor made!");
    }

    public void destroy() {
        System.out.println("Destructor called for Employee ID: " + this.id);
    }
}
