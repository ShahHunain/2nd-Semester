
import java.io.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
E e1 = new E(1,"Abc");
System.out.println("Done");
FileOutputStream fileOut = new FileOutputStream("a.txt");
ObjectOutputStream o = new ObjectOutputStream(fileOut);
o.writeObject(e1);
o.close();
fileOut.close();
FileInputStream s = new FileInputStream("a.txt");
ObjectInputStream o1 = new ObjectInputStream(s);
E e2=(E)o1.readObject();
o1.close();
s.close();
System.out.println(e2.toString());




    }

}












