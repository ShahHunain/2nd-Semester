public class Bird <T,U> extends Pet <T,U>{

    Bird(T name, U age){
        super(name,age);
    }
    
    void makeSound(){
        System.out.println(getClass()+" chirps");
    }

    public void printDetails(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
    }
    
}
