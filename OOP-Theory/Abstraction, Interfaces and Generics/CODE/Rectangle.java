public abstract class Rectangle extends Shape{


    double length;
    double width;

    Rectangle(double l, double w, String c){
        super(c);
        this.length=l;
        this.width=w;
    }
    double area() {
        return length*width;
    }


    public String toString() {

        String s = "The color of shape is : "+getColor()+"area is "+area();
        return s;



    }
}
