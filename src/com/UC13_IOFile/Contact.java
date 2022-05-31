package com.UC13_IOFile;

public class Contact {
	//Declaring Variables for Contacts Class
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNum;
    private String emailID;


    //Method of Contacts class
    public Contact(String firstName, String lastName, String address, String city, String state, String email, String phoneNumber, String zip) {
        setFirstName(firstName);
        setLastname(lastName);
        setAddress(address);
        setCity(city);
        setState(state);
        setEmailID(email);
        setPhoneNum(phoneNumber);
        setZip(zip);
    }

    //Adding Getter and Setter Methods for the above Variables of Contact class
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    @Override                           // to return the values of object
    public String toString() {
        return "Contact Details [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
                + city + ", state=" + state + ", email=" + emailID + ", zip=" + zip + ", phoneNumber=" + phoneNum + "]";
    }
}
