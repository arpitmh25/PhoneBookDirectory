package bridgelabz;


import java.util.ArrayList;

public class PhoneDirectorySystemMain {
    public static void main(String[] args) {
        PhoneDirectorySystem phoneDirectorySystem = new PhoneDirectorySystem();
        PhoneDirectory phoneDirectory1 = new PhoneDirectory();
        phoneDirectory1.addMemberInformation(
                new PersonDetails("Arpit", "Mhaisne", "Pimple Saudagar", "Pune",
                        "Maharastra", 412375, "iamarpit@gmail.com"),
                new ContactDetails("462747", "8888888888"));
        phoneDirectory1.addMemberInformation(
                new PersonDetails("Mangesh", "Palan", "Pimple Saudagar", "Chennai",
                        "Maharastra", 423475, "madnsjt@gmail.com"),
                new ContactDetails("462747", "7548888888"));
        phoneDirectory1.addMemberInformation(
                new PersonDetails("Aditya", "Chotte", "Pimple Saudagar", "Akola",
                        "Maharastra", 132375, "jfdrpit@gmail.com"),
                new ContactDetails("768492", "7462859376"));
        PhoneDirectory phoneDirectory2 = new PhoneDirectory();
        phoneDirectory2.addMemberInformation(
                new PersonDetails("Arpit", "Mhaisne", "Pimple Saudagar", "Pune",
                        "Maharastra", 412375, "iamarpit@gmail.com"),
                new ContactDetails("462747", "8888888888"));
        phoneDirectory2.addMemberInformation(
                new PersonDetails("Mangesh", "Palan", "Pimple Saudagar", "Chennai",
                        "Maharastra", 423475, "madnsjt@gmail.com"),
                new ContactDetails("462747", "7548888888"));
        phoneDirectory2.addMemberInformation(
                new PersonDetails("Aditya", "Chotte", "Pimple Saudagar", "Akola",
                        "Maharastra", 132375, "jfdrpit@gmail.com"),
                new ContactDetails("768492", "7462859376"));
        ArrayList<PhoneDirectory> phoneDirectories = new ArrayList<>();
        phoneDirectories.add(phoneDirectory1);
        phoneDirectories.add(phoneDirectory2);

        phoneDirectorySystem.addPhoneDirectories(phoneDirectories);
        phoneDirectorySystem.getPhoneDirectoryList();
    }
}