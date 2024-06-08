public class IntMatrix extends Matrix <Integer> {

    IntMatrix(int noOfRows, int noOfColumns){
        super(noOfRows, noOfColumns);
    }
    
    public void display(){
        System.out.println(getClass()+"");
        super.display();
    }

}
