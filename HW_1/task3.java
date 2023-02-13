package Homeworks.HW_1;
import java.util.Arrays;
//Реализовать простой калькулятор (+ - / *)
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input expression devided by spaces: ");
        String expression = iScanner.nextLine();
        iScanner.close();
        String[] calc = expression.split(" ");
        int result = 0;
        double result1 = 0;
        switch (calc[1]) {
            case "+":
                result = Integer.parseInt(calc[0]) + Integer.parseInt(calc[2]);
                break;
            case "-":
            result = Integer.parseInt(calc[0]) - Integer.parseInt(calc[2]);
            break;
            case "*":
                result = Integer.parseInt(calc[0]) * Integer.parseInt(calc[2]);
                break;
            case "/":
            result1 = Double.parseDouble(calc[0]) / Double.parseDouble(calc[2]);
            break;
        }
        if (calc[1] == "/") {
            System.out.println("result = " + result1);
        } else 
        System.out.println("result = " + result);
    }
}
