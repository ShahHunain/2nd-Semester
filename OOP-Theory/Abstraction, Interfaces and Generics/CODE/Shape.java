public abstract class Shape {
    String color;

        Shape (String c){
            color=c;

        }
    abstract double area();
    abstract String ToString();

    public String getColor(){
        return color;
    }
}
