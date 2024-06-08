public class DarazPersonData{
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;

    public void setFirstName(String fName){
        this.firstName=fName;
    }

    public void setLastName(String lName){
        this.lastName=lName;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public void setCity(String city){
        this.city=city;
    }

    public void setState(String state){
        this.state=state;
    }

    public void setZip(String zip){
        this.zip=zip;
    }

    public void setPhone(String phone){
        this.phone=phone;
    }

    public String getName(){
        return this.firstName + " " + this.lastName;
    }

    public String getAddress(){
        return this.address;
    }

    public String getCity(){
        return this.city;
    }

    public String getState(){
        return this.state;
    }

    public String getZip(){
        return this.zip;
    }

    public String getPhone(){
        return this.phone;
    }
}