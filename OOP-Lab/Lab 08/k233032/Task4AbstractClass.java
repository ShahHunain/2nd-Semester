abstract class Task4AbstractClass{

    Task4AbstractClass(){
        System.out.println("This is constructor of abstract class");
    }

    abstract void a_method();

    public void non_abstract_method(){
        System.out.println("This is a normal method of abstract class");
    }

}
