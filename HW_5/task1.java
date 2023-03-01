package Homeworks.HW_5;
/* Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
Добавить функции 1) Добавление номера
2) Вывод всего */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();
        phoneBook.put("Anton", List.of("8-972-153-2635","8-942-863-25-43"));
        phoneBook.put("Masha", List.of("8-972-105-2635","8-916-863-29-43"));
        phoneBook.put("Sonya", List.of("8-972-153-9573","8-925-345-25-43"));

        bookMenu(phoneBook);
            
        }
       
    public static void printPhoneBook(Map<String, List<String>> book) {
        for (Map.Entry<String, List<String>> pair: book.entrySet()) {
        System.out.println(pair.getKey() + " " + pair.getValue());
        } 
    }
    public static void addName(Map<String, List<String>> book) {
        System.out.println("Enter name: ");
        Scanner iScanner = new Scanner(System.in);
        String name = iScanner.nextLine();
        List<String> number = new ArrayList<>();
        boolean addPhone = true;
        while (addPhone) {
            System.out.println("Enter phone number: ");
            String phone = iScanner.nextLine();
            number.add(phone);
            System.out.println("Wish to add one more number? Print 'Y' - for 'Yes' and 'N' for 'No': ");
            String userChoice = iScanner.nextLine();
            if (userChoice.equals("N")) {
                addPhone = false;
            } 
        }
        book.put(name, number);
        System.out.println("The contact is added");
        iScanner.close();
    }
    public static void bookMenu(Map<String, List<String>> book) {
        System.out.print("Press '1' to add contact or '2' to print the phonebook: ");
        Scanner iScanner = new Scanner(System.in);
        int choice = iScanner.nextInt();
        if(choice == 1) {
            addName(book);
        } else if(choice == 2) {
            printPhoneBook(book);
        } else {
            System.out.println("Something went wrong. Please, try again.");
            bookMenu(book);
        }
        iScanner.close();
    }
}
