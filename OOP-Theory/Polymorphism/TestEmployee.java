
public class TestEmployee {


    public static void main(String[] args) {

     Triangle t1 = new Triangle(2,5,"Triangle", "Blue");
     t1.getArea();
     t1.display();

        Circle c1 = new Circle(2.0,"Circle", "Orange");
        c1.getArea();
        t1.display();

//---------------------------------------------------------------------
        //Upcasting Traingle to Shape
        Shapes s1 = new Triangle(5,4,"Triangle","Blue");
        s1.getArea();
        s1.display();
//Upcasting Circle to Shape
        s1 = new Circle(5.0,"Circle","Orange");

        s1.getArea();
        s1.display();












    }

}
















