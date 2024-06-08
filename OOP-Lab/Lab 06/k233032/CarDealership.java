public class CarDealership {
    private String name;
    private String role;

    CarDealership(){
        this.name="null";
        this.role="null";
    }

    
    CarDealership(String n, String r){
        this.name=n;
        this.role=r;
    }

    public String getName(){
        return name;
    }

    public void setRole(String n){
        this.role=n;
    }

    public String getRole(){
        return role;
    }

    public void handleCustomerInquiries() {
        System.out.println(role + " :" + name + " is handling customer inquiries.");
    }

}