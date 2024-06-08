public class Derived extends Base{

    public Derived(){
        count++;
    }

    protected void finalize(){
        super.finalize();
    }
    
}
