abstract class Ball implements Tossable{
    private String brandName;

    Ball(String brandName){
        this.brandName=brandName;
    }

    public String getBrandName(){
        return this.brandName;
    }

    public abstract void bounce();

}
