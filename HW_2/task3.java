//Напишите метод, который принимает на вход строку (String) 
//и определяет является ли строка палиндромом (возвращает boolean значение).
package Homeworks.HW_2;


import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "cp866");
        System.out.println("Input a word: ");
        String line = scan.nextLine();
        Palindrome(line);
        scan.close();
    }
    public static void Palindrome(String someStr) {
        StringBuilder s = new StringBuilder(someStr).reverse();
        String reverse = s.toString();
        if(someStr.compareToIgnoreCase(reverse) == 0){
            System.out.println(someStr + " " + "- палиндром"); 
        } else {
            System.out.println(someStr + " " + "- не палиндром");;
        }
    }
    
}
