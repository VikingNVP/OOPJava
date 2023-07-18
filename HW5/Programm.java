package HW5;

import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {
        System.out.println("Телефонный справочник! \n Выбери действие: " + 
        "\n1 - Добавить(Создать) контакт"+ 
        "\n2 - Удалить контакт"+
        "\n3 - Вывести справочник"+
        "\n4 - Завершить работу");
        try(Scanner sc = new Scanner(System.in)){
            Integer s = sc.nextInt();
            switch (s) {
                case 1:
                    sc.nextLine();
                    PhoneBook.addContact();
                    break;
        
                default:
                    break;

            }
        }
    }
}
