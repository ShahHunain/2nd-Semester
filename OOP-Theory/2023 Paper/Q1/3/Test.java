public class Test {
    public static void main(String[] args) {
        Base.printCount();
        Base obj1 = new Base();

        Derived obj2 =  new Derived();
        Base.printCount();
        obj2.finalize();
        Derived.printCount();
        obj1.finalize();
        Base.printCount();
    }
}
