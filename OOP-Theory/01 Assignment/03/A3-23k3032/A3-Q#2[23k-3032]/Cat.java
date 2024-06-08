public class Cat <T,U> extends Pet <T,U> {

    Cat(T name, U age){
        super(name,age);
    }

    void makeSound(){
        System.out.println(getClass()+" meows");
    }

    public void printDetails(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
    }
    
}
