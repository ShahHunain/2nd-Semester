public class Dog <T,U> extends Pet <T,U>{

    Dog(T name, U age){
        super(name,age);
    }
    
    void makeSound(){
        System.out.println(getClass()+" woofs");
    }

    public void printDetails(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
    }
    
}
