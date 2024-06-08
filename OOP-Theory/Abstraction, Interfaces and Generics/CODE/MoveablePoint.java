public class MoveablePoint implements Moveable{

   private int x;
   private int y;

   MoveablePoint(int x,int y){
       this.x=x;
       this.y=y;
   }
    @Override
    public void movedown() {

        y--;
    }

    public void moveup() {

        y++;
    }

    public void moveleft() {

        x--;
    }

    public void moveright() {

        x++;
    }

    public String toString(){
       return "x : "+x +"and"+" Y : "+y;
    }
}
