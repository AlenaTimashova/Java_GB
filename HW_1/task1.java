//Вычислить n-ое треугольного числa(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
package Homeworks.HW_1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input number: ");
        int number = iScanner.nextInt();
        iScanner.close();
        int sum = 0;
        int mult = 1;
        for (int index = 1; index <= number; index++){
            sum += index;
            mult *= index;
        }
        System.out.println("Triangle number: " + sum + ",factorial: " + mult);
    }
    
}

