package HW5;

public class Contact {
    private String firstname;
    private String lastname;
    private String phone;
    private String email;
    private String address;

    public Contact(String string, String string2, String string3, String string4, String string5) {
    }
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }
    public String getFirstName() {
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
}
