public class Circle extends Shapes {

    private double radius;

    Circle(double r, String s, String c){
        super(s,c);
        this.radius=r;
    }

    @Override
    public double getArea(){
        return 2*3.147*this.radius*this.radius;
    }
    @Override
    public void display(){
        super.display();
        System.out.println(this.radius);
        System.out.println(getArea());
    }
}
