package Homeworks.HW_2;
/* Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), 
результат после каждой итерации запишите в лог-файл.*/

import java.io.FileWriter;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int [] numbers = {8, 5, 7, 6, 2, 4};
        boolean isSorted = false;
        try {
        FileWriter myFile = new FileWriter("array.txt", false);
        while(!isSorted) {
            isSorted = true;
            for (int index = 0; index < numbers.length-1; index++) {
                if (numbers[index] > numbers[index + 1]){
                    isSorted = false;
                    int temp = numbers[index];
                    numbers[index] = numbers[index + 1];
                    numbers[index + 1] = temp;
                }
               myFile.write(numbers[index] + " ");
            }
            myFile.write(numbers[numbers.length-1] + "\n");
        }
        myFile.close();
        } catch (Exception e) {
        System.out.println("Something went wrong");
        }
        
    }
    
}
