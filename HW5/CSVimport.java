package HW5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVimport {
    public static PhoneBook importFromFile(String filename) throws IOException {
        PhoneBook phonebook = new PhoneBook();
        try(BufferedReader reader = new BufferedReader(new FileReader("HW5/phonebook.csv"))){
            String line;
            while((line = reader.readLine()) != null){
                String[] fields = line.split(",");
                Contact contact = new Contact(fields[0], fields[1], fields[2], fields[3], fields[4]);
                phonebook.addContact(contact);
            }
        }
        return phonebook;
    }
}
