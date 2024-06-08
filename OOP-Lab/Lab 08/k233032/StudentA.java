public class StudentA extends Marks{
    private double marks1;
    private double marks2;
    private double marks3;
    private double marks4;

    StudentA(double m1,double m2,double m3,double m4){
        this.marks1=m1;
        this.marks2=m2;
        this.marks3=m3;
        this.marks4=m4;
    }

    double getPercentage(){
        return ((marks1+marks2+marks3+marks4)/400)*100;
    }

}