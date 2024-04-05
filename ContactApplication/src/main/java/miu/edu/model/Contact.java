package miu.edu.model;

import java.util.ArrayList;
import java.util.List;
public class Contact {
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private List<UserPhoneNumber> phoneNumbers= new ArrayList<>();
    private List<UserEmail> emails = new ArrayList<>();
    public Contact(String firstName, String lastName, String company, String jobTitle, List<UserPhoneNumber> phoneNumbers, List<UserEmail> emails) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.phoneNumbers = phoneNumbers;
        this.emails = emails;
    }
    public void addPhoneNumber(UserPhoneNumber phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }
    public void addEmail(UserEmail email) {
        emails.add(email);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<UserPhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<UserPhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<UserEmail> getEmails() {
        return emails;
    }

    public void setEmails(List<UserEmail> emails) {
        this.emails = emails;
    }
    //The user of the application should be able to search
    public List<Contact> search(String name) {
        List<Contact> contacts = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(name) || contact.getLastName().equals(name)) {
                contacts.add(contact);
            }
        }
        return contacts;
    }
    // Add new contacts,
    public void addContact(Contact contact) {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(contact);
    }
    // update existing contacts, and delete old contacts.
    public void updateContact(Contact contact) {
        List<Contact> contacts = new ArrayList<>();
    for (Contact c : contacts) {
            if (c.getFirstName().equals(contact.getFirstName()) && c.getLastName().equals(contact.getLastName())) {
                c.setCompany(contact.getCompany());
                c.setJobTitle(contact.getJobTitle());
                c.setPhoneNumbers(contact.getPhoneNumbers());
                c.setEmails(contact.getEmails());
            }
        }
    }
    public void deleteContact(Contact contact) {
        List<Contact> contacts = new ArrayList<>();
        contacts.remove(contact);
    }
    // In addition to this it is important to be able to merge duplicate contacts.
    public void mergeDuplicateContacts(Contact contact1, Contact contact2) {
        List<Contact> contacts = new ArrayList<>();
        for (Contact c : contacts) {
            if (c.getFirstName().equals(contact1.getFirstName()) && c.getLastName().equals(contact1.getLastName())) {
                c.setCompany(contact1.getCompany());
                c.setJobTitle(contact1.getJobTitle());
                c.setPhoneNumbers(contact1.getPhoneNumbers());
                c.setEmails(contact1.getEmails());
            }
            if (c.getFirstName().equals(contact2.getFirstName()) && c.getLastName().equals(contact2.getLastName())) {
                c.setCompany(contact2.getCompany());
                c.setJobTitle(contact2.getJobTitle());
                c.setPhoneNumbers(contact2.getPhoneNumbers());
                c.setEmails(contact2.getEmails());
            }
        }
    }
    public void printJSON(){
        System.out.println("{");
        System.out.println("  \"firstName\": \"" + firstName + ",");
        System.out.println("  \"lastName\": \"" + lastName + ",");
        System.out.println("  \"company\": \"" + company + ",");
        System.out.println("  \"jobTitle\": \"" + jobTitle + ",");
        System.out.println("  \"phoneNumbers\": [");
        for (UserPhoneNumber phoneNumber : phoneNumbers) {
            System.out.println("    {");
            System.out.println("      \"phoneNumber\": \"" + phoneNumber.getPhoneNumber() + "\",");
            System.out.println("      \"type\": \"" + phoneNumber.getType() + "\"");
            System.out.println("    },");
        }
        System.out.println("  ],");
        System.out.println("  \"emails\": [");
        for (UserEmail email : emails) {
            System.out.println("    {");
            System.out.println("      \"Email\": \"" + email.getEmail() + "\",");
            System.out.println("      \"Type\": \"" + email.getType() + "\"");
            System.out.println("    },");
        }
        System.out.println("  ]");
        System.out.println("}");

    }
}
