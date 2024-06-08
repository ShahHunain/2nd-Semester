public class Student {
    
    int id;
    String name;

    Student(int i, String n){
        this.id=i;
        this.name=n;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getSetudents(){
        System.out.println("Id: "+this.id);
        System.out.println("Name: "+this.name);
    }

}
