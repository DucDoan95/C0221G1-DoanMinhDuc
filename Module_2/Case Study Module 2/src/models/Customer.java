package models;

public class Customer {
    private String name;
    private String birthday;
    private String gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String customerType;
    private String address;
    private Services service;

    public Customer() {
    }

    public Customer(String name, String birthday, String gender, String idCard, String phoneNumber, String email, String customerType, String address, Services service) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
        this.service = service;
    }

    public Customer(String name, String birthday, String gender, String idCard, String phoneNumber, String email, String customerType, String address) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }
    public String showInfor(){
       return this.toString();
    }
    @Override
    public String toString() {
        return
                "Name: " + name +
                ", Birthday: " + birthday +
                ", Gender: " + gender +
                ", ID Card: " + idCard +
                ", Phone Number: " + phoneNumber +
                ", Email: " + email +
                ", Customer Type: " + customerType +
                ", Address: " + address ;

    }
}
