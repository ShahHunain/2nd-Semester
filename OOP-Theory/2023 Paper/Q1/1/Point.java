class Point{

    private int x;
    private int y;

    public Point(int i, int j){
        x=i;
        y=j;
        System.out.println("Normal Constructor called");
    }

    Point(Point t){
        y=t.y;
        System.out.println("Copy Constructor called");
    }

    void display(){
        System.out.println("Value of x ="+x);
        System.out.println("Value of y ="+y);
    }

    public static void main(String[] args) {
        Point t1 = new Point(10,15);
        Point t2 = new Point(t1);
        Point t3 =t1;
        t3.display();
    }


}