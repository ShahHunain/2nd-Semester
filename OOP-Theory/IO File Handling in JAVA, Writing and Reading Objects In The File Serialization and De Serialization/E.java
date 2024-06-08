import java.io.Serializable;

class E implements Serializable {
int id;
String name;

E(int i, String n){
 this.id=i;
 this.name=n;
}

public String toString(){
 return id +" "+name;
}
 }
