package com.bridgelabz.review;


import java.util.LinkedList;

public class PhoneDirectory {

    private LinkedList<PersonDetails> memberContacts = new LinkedList<>();


    public void addMemberContactDetails(String firstName, String lastName, String address, String addressCity, String addressState,
                                        int addresszip, String landLinePhoneNumber, String mobilePhoneNumber, String email) {
        PersonDetails member = new PersonDetails(firstName, lastName, address, addressCity, addressState, addresszip, landLinePhoneNumber, mobilePhoneNumber, email);
        memberContacts.add(member);
        System.out.println("Members are getting added");
        display(member);
    }

    public void display(PersonDetails member) {

        System.out.println("first name is :" + member.firstName);

        System.out.println(" last name is :" + member.lastName);

        System.out.println(" address is :" + member.address);

        System.out.println(" city name is :" + member.addressCity);

        System.out.println(" state name is :" + member.addressState);

        System.out.println(" zip code is  :" + member.addresszip);

        System.out.println(" phone number is :" + member.landLinePhoneNumber);

        System.out.println(" mobile number is :" + member.mobilePhoneNumber);

        System.out.println(" email address is :" + member.email);


    }

    public static void main(String[] args) {

        PhoneDirectory entry1 = new PhoneDirectory();
        entry1.addMemberContactDetails("Arpit", "Mhaisne", "Pimple Saudagar", "Pune", "Maharastra", 412375, "27653627", "8888888888", "iamarpit@gmail.com");


    }
}

