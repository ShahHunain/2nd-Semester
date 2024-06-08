public abstract class Circle  extends Shape{

    double radius;

    Circle(int r,String c){
        super(c);
        this.radius=r;

    }



    double area() {
        return radius*radius*3.147;
    }


    public String toString() {

        String s = "The color of shape is : "+getColor()+"area is "+area();
        return s;



    }
}
