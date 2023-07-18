package HW5;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contacts;
    public PhoneBook(){
        contacts = new ArrayList<>();
    }
    public void addContact(Contact contact){
        contacts.add(contact);
    }
    public void removeContact(int index){
        contacts.remove(index);
    }
    public Contact getContact(int index){
        return contacts.get(index);
    }
    public int getNumContact(){
        return contacts.size();
    }
}
