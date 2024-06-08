public class Adder{
    
    protected static int sum;

    public static void add(int a, int b){
        sum=a+b;
        System.out.println("The sum of "+a+" and "+b+" is: "+getSum());
    }

    public static void add(int numbers[]){
        sum=0;
        for(int i: numbers){
            sum=sum+i;
        }
        System.out.println("The sum of the array is: "+getSum());
    }

    public static int getSum(){
        return sum;
    }


}