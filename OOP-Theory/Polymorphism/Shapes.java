 class Shapes {
    protected String name;
    protected String color;

    Shapes(String s, String c){
        this.name=s;
        this.color=c;
    }

    protected  void display(){
        System.out.println( " The name of Shape Is  "+name +" and color is "+color );
    }

    public double getArea(){
        return 0.0;
    }
 }







