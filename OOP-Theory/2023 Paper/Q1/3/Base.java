public class Base{

    public static int count;

    public Base(){
        count++;
    }

    protected void finalize(){
        count--;
    }

    static void printCount(){
        System.out.println("Count: "+count);
    }

}