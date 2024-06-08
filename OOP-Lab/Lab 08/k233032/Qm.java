import java.util.ArrayList;

public class Qm implements Queue{
    ArrayList<Integer> queue = new ArrayList<Integer>();

    public void add(int n){
        queue.add(n);
        System.out.println(n+ " added to queue");
    }

    public void remove(){
        if(queue.isEmpty()){
            System.out.println("Elements can not be removed as th queue is empty ");
        }
        else{
            int element = queue.remove(0);
            System.out.println(element+ " removed from queue");
        }
    }

    public boolean check(){
        if(queue.size()==0){
            System.out.println("Queue is empty");
            return true;
        }
        else{
            System.out.println("Queue is not empty");
            return false;
        }
    }

    
}
