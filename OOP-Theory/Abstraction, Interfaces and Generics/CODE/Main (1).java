import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        A a5 = new A("Zoya");
        System.out.println(a5.getX());

        A<Integer> a1 = new A<Integer>(5);
        Integer s = a1.getX();
        System.out.println(s);

        Integer [] myarr ={1,2,3,4,5};
        A.display(myarr);





    }
}