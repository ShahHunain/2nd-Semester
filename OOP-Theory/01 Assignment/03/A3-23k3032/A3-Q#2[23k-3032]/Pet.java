public abstract class Pet <T,U> {
    
    private T name;
    private U age;

    Pet(T name, U age){
        this.name=name;
        this.age=age;
    }

    abstract void makeSound();
    
    public T getName(){
        return this.name;
    }

    public U getAge(){
        return this.age;
    }

}
