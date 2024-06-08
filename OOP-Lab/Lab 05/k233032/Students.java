public class Students {
    String Studentid;
    String name;
    double[] grades = new double[5];
    static int j;

    Students(){
        this.Studentid="null";
        this.name="null";
        j=0;
    }

    Students(String id, String n, double marks[]){
        this.Studentid=id;
        this.name=n;
        this.grades=marks;
    }

    public double getAverage(){
        j++;
        double avg=((this.grades[0]+this.grades[1]+this.grades[2]+this.grades[3]+this.grades[4])/5);
        if(j<=5){
        System.out.println("Student Id: "+this.Studentid+"\nName: "+this.name+"\nAverage: "+avg);
        }
        return avg;
    }

}
