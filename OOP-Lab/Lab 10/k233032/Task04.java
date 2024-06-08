public class Task04<T extends Comparable<T>>{
    
    String userName="shah@gmail.com";
    String password="shah123";

    Task04(T userName, T password){
        if(userName.equals(this.userName)){
            if(password.equals(this.password)){
                System.out.println("Logon Successful");
            }
            else{
                System.out.println("Process Terminated");
            }
        }else{
            System.out.println("Process Terminated");
        }
    }
}