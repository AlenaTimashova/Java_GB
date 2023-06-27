package Homeworks.Exceptions.HW2;

import java.util.Scanner;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя!
 */
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = sc.nextLine();
        while (text.isEmpty()) {
            System.out.println("Ошибка! Вы ввели пустую строку. Повторите ввод: ");
            text = sc.nextLine();
        }
    }
}
