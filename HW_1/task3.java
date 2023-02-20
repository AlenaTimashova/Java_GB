package Homeworks.HW_1;
//import java.nio.file.Paths;
import java.util.Arrays;
import java.util.logging.*;
import java.io.IOException;

//Реализовать простой калькулятор (+ - / *)
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) throws IOException {
        Logger loger = Logger.getLogger(task3.class.getName());
        loger.setLevel(Level.INFO);

        // String currentPath = Paths.get("")
        //                           .toAbsolutePath()
        //                           .toString();

        // String logsPath = currentPath + "\\logs.txt";

        FileHandler fh = new FileHandler("logs.txt");
        loger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input expression devided by spaces: ");
        String expression = iScanner.nextLine();
        iScanner.close();
        
        String[] calc = expression.split(" ");
        loger.info(Arrays.toString(calc));
        
        int result = 0;
        Double d = Double.valueOf(result);
        switch (calc[1]) {
            case "+":
                result = Integer.parseInt(calc[0]) + Integer.parseInt(calc[2]);
                loger.info(Integer.toString(result));
                break;
            case "-":
            result = Integer.parseInt(calc[0]) - Integer.parseInt(calc[2]);
            loger.info(Integer.toString(result));
            break;
            case "*":
                result = Integer.parseInt(calc[0]) * Integer.parseInt(calc[2]);
                loger.info(Integer.toString(result));
                break;
            case "/":
            
            d = Double.parseDouble(calc[0]) / Double.parseDouble(calc[2]);
            loger.info(Double.toString(d));
            break;
        }
        if(calc[1].equals("/")) System.out.println("result = " + d);
        else  System.out.println("result = " + result);
    }
}