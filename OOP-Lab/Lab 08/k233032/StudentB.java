public class StudentB extends Marks{
    private double marks1;
    private double marks2;
    private double marks3;

    StudentB(double m1,double m2,double m3){
        this.marks1=m1;
        this.marks2=m2;
        this.marks3=m3;
    }

    double getPercentage(){
        return ((marks1+marks2+marks3)/300)*100;
    }
}