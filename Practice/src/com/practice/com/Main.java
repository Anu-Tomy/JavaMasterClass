package com.practice.com;
//www.udacity.com Object Oriented Programming in Java

class Contact {
    private String name;
    private String email;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
class ContactsManager {
    //Fields
    private Contact[] myFriends;
    private int friendsCount;

    //Constructor
    public ContactsManager() {
        this.myFriends = new Contact[500];
        this.friendsCount = 0;
    }
    //Methods
    public void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }
    public Contact searchContact(String searchName){
        for(int i = 0; i < friendsCount; i++) {
            if (myFriends[i].getName().equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
        }
    }

public class Main {

    public static void main(String[] args) {
        //Create the ContactsManager object
        ContactsManager myContactsManager = new ContactsManager();

        //Create a new Contact object for Tom
        Contact tomContact = new Contact();
        // Set the fields
        tomContact.setName("Tom");
        tomContact.setPhoneNumber("12345");
        //Add Tom's contact to the ContactsManager
        myContactsManager.addContact(tomContact);

        Contact edContact = new Contact();
        edContact.setName("Edwin");
        edContact.setPhoneNumber("6789");
        myContactsManager.addContact(edContact);

        Contact colContact = new Contact();
        colContact.setName("Colin");
        colContact.setPhoneNumber("23456");
        myContactsManager.addContact(colContact);

        Contact momContact = new Contact();
        momContact.setName("Mom");
        momContact.setPhoneNumber("5678");
        myContactsManager.addContact(momContact);

        //Search for a contact and display their phone number
        Contact result = myContactsManager.searchContact("Mom");
        System.out.println(result.getPhoneNumber());

    }
}
