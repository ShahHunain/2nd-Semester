public class Task03 <T>{

    public static <T> void swap(T x, T y){
        T temp= x;
        x=y;
        y=temp;
        System.out.println("After swapping first is: "+x+" and second is "+y);
    }

}
