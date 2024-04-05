package miu.edu;

import miu.edu.model.Contact;
import miu.edu.model.UserEmail;
import miu.edu.model.UserPhoneNumber;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        David     Sanger  Argos LLC  Sales Manager
//        240-133-0011 Home dave.sang@gmail.com Home
//        240-112-0123 Mobile dsanger@argos.com Work
        UserEmail email1 = new UserEmail("dave.sang@gmail.com", "Home");
        UserEmail email2 = new UserEmail("dsanger@argos.com", "Work");
        UserPhoneNumber phone1 = new UserPhoneNumber("240-133-0011", "Home");
        UserPhoneNumber phone2 = new UserPhoneNumber("240-112-0123", "Mobile");
        List<UserPhoneNumber> phoneNumbers = List.of(phone1, phone2);
        List<UserEmail> emails = List.of(email1, email2);
        Contact contact=
                new Contact("David", "Sanger",
                        "Argos LLC", "Sales Manager", phoneNumbers, emails);
        UserEmail email3= new UserEmail("null","null");
        UserPhoneNumber phone3= new UserPhoneNumber("null","null");
        Contact contact1=
                new Contact("Carlos", "Jimenez","Zappos", "Director", List.of(phone3), List.of(email3));

        UserEmail email4= new UserEmail("ali@bmi.com","work");
        UserPhoneNumber phone4= new UserPhoneNumber("412-116-9988","work");
        Contact contact2=
                new Contact("Ali", "Gafar","BMI Services", "HR Manager", List.of(phone4), List.of(email4));


        List<Contact> printList= List.of(contact,contact1,contact2);
        for (Contact p:printList){
            p.printJSON();
            System.out.println("____________________________");
        }




    }
}