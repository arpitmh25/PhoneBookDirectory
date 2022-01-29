package com.bridgelabz.review;

public class PersonDetails {
    String firstName;
    String lastName;
    String address;
    String addressCity;
    String addressState;
    int addresszip;
    String landLinePhoneNumber;
    String mobilePhoneNumber;
    String email;

    public PersonDetails(String firstName, String lastName, String address, String addressCity, String addressState, int addresszip, String landLinePhoneNumber, String mobilePhoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.addressCity = addressCity;
        this.addressState = addressState;
        this.addresszip = addresszip;
        this.landLinePhoneNumber = landLinePhoneNumber;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.email = email;
    }

    public void setZip(int newZipCode) {
        this.addresszip = newZipCode;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public void setCity(String newCityName) {
        this.addressCity = newCityName;
    }

    public void setState(String newStateName) {
        this.addressState = newStateName;
    }

    public void setLandLinePhoneNumber(String newLandLinePhoneNumber) {
        this.landLinePhoneNumber = newLandLinePhoneNumber;
    }

    public void setMobilePhoneNumber(String newMobilePhoneNumber) {
        this.mobilePhoneNumber = newMobilePhoneNumber;
    }

    public void setEmail(String newEmailAddress) {
        this.email = newEmailAddress;
    }
}
