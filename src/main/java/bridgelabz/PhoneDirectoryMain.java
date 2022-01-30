package bridgelabz;

public class PhoneDirectoryMain {
    public static void main(String[] args) {

        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.addMemberInformation(
                new PersonDetails("Arpit", "Mhaisne", "Pimple Saudagar", "Pune",
                        "Maharastra", 412375, "iamarpit@gmail.com"),
                new ContactDetails("462747", "8888888888"));
        phoneDirectory.addMemberInformation(
                new PersonDetails("Mangesh", "Palan", "Pimple Saudagar", "Chennai",
                        "Maharastra", 423475, "madnsjt@gmail.com"),
                new ContactDetails("462747", "7548888888"));
        phoneDirectory.addMemberInformation(
                new PersonDetails("Aditya", "Chotte", "Pimple Saudagar", "Akola",
                        "Maharastra", 132375, "jfdrpit@gmail.com"),
                new ContactDetails("768492", "7462859376"));
        phoneDirectory.addMemberInformation(
                new PersonDetails("Shubham", "Fourkm", "Nilakh Saudagar", "Nagar",
                        "Maharastra", 674375, "fjdfh@gmail.com"),
                new ContactDetails("876546", "8674527584"));
        System.out.println();
        phoneDirectory.getPersonDetails(new ContactDetails("462747", "8888888888"));
        phoneDirectory.editPersonDetails(new ContactDetails("462747", "8888888888"), "addresscity", "Mumbai");
        //To check if person details got edited
        phoneDirectory.getPersonDetails(new ContactDetails("462747", "8888888888"));
        phoneDirectory.deletePersonDetails(new ContactDetails("462747", "8888888888"));
        //To check if person details got deleted
        phoneDirectory.getPersonDetails(new ContactDetails("462747", "8888888888"));
        //Get all Person Details
        phoneDirectory.displayAllPersonDetails();
    }
}
