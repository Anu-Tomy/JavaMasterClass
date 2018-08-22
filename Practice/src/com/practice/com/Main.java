package com.practice.com;
//www.udacity.com Object Oriented Programming in Java

class Contact {
    String name;
    String email;
    String phoneNumber;
}
class ContactsManager {
    //Fields
    Contact[] myFriends;
    int friendsCount;

    //Constructor
    ContactsManager() {
        this.myFriends = new Contact[500];
        this.friendsCount = 0;
    }
    //Methods
    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }
    Contact searchContact(String searchName){
        for(int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(searchName)) {
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
        tomContact.name = "Tom";
        tomContact.phoneNumber = "12345";
        //Add Tom's contact to the ContactsManager
        myContactsManager.addContact(tomContact);

        Contact edContact = new Contact();
        edContact.name = "Edwin";
        edContact.phoneNumber = "6789";
        myContactsManager.addContact(edContact);

        Contact colContact = new Contact();
        colContact.name = "Colin";
        colContact.phoneNumber = "23456";
        myContactsManager.addContact(colContact);

        Contact momContact = new Contact();
        momContact.name = "Mom";
        momContact.phoneNumber = "5678";
        myContactsManager.addContact(momContact);

        //Search for a contact and display their phone number
        Contact result = myContactsManager.searchContact("Mom");
        System.out.println(result.phoneNumber);





    }
}
