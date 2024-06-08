public class Triangle extends Shapes {


   private int base;
    private int height;

    Triangle (int b,int s, String n,String c){
        super(n,c);
        this.base=b;
        this.height=s;
    }
@Override
    public double getArea(){
        double x= (base * height)/2.0;
        return x;
    }

    public void display(){
        super.display();
        System.out.println(this.height);
        System.out.println(this.base);
        System.out.println(getArea());
    }

  }















