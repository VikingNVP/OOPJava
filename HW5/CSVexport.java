package HW5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CSVexport {
    public static void exportToFile(PhoneBook phoneBook, String filename) throws IOException{
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("HW5/phonebook.csv"))){
            for (int i = 0; i < phoneBook.getNumContact(); i++) {
                Contact contact = phoneBook.getContact(i);
                String line = contact.getFirstName() + "," + contact.getLastname()+ "," +
                contact.getPhone()+ "," + contact.getEmail()+ "," + contact.getAddress();
                writer.write(line);
                writer.newLine();
            }
        }
    }
}
