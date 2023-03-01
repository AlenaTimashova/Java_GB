package Homeworks.HW_1;
//import java.nio.file.Paths;
import java.util.Arrays;
import java.util.logging.*;
import java.io.IOException;

//Реализовать простой калькулятор (+ - / *)
import java.util.Scanner;
import java.util.Stack;
public class task3 {
    public static void main(String[] args) throws IOException {
        // Logger loger = Logger.getLogger(task3.class.getName());
        // loger.setLevel(Level.INFO);

        // FileHandler fh = new FileHandler("logs.txt");
        // loger.addHandler(fh);
        // SimpleFormatter formatter = new SimpleFormatter();
        // fh.setFormatter(formatter);
        Stack<Double> stk = new Stack<>();
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input expression devided by spaces: ");
        String expression = iScanner.nextLine();
        String[] calc = expression.split(" ");
        //loger.info(Arrays.toString(calc));
        
        double result = calculate(Double.parseDouble(calc[0]), Double.parseDouble(calc[2]), calc[1]);
        stk.push(result);
        System.out.println(result);
        boolean exit = false;
        while(!exit){
            System.out.println("Enter 'cancel' to cancel previous operation\n next sign and digit devided by space to calculate:\nor 'exit' to exit the calculator: ");
            String[] choice = iScanner.nextLine().split(" ");
            if(choice[0].equals("cancel")){
                stk.pop();
            } else if(choice[0].equals("exit")) {
                exit = true;
            } else {
                result = calculate(stk.peek(), Double.parseDouble(choice[1]), choice[0]);
                stk.push(result);
                System.out.println(result);
            }
        }
        
        iScanner.close();
    }
    public static Double calculate(double x, double y, String s) {
        double result = 0;
        
        switch (s){
            case "+": 
            result = x + y;
            break;

            case "-":
            
            result = x - y;
            break;

            case "/":
            
            result = x / y;
            break;

            case "*":
            
            result = x * y;
            break;
        }
    
        return result;
    }
}
