public class DoubleMatrix extends Matrix <Double> {
    
    DoubleMatrix(int noOfRows, int noOfColumns){
        super(noOfRows, noOfColumns);
    }

    public void display(){
        System.out.println(getClass()+"");
        super.display();
    }

}
