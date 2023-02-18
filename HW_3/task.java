package Homeworks.HW_3;

import java.util.ArrayList;
import java.util.Random;

/* Пусть дан произвольный список целых чисел, удалить из него четные числа
   Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка
*/
public class task {
    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>();
        randFillList(5, 100, numbers);
        System.out.println(numbers.toString());
        //removeEvens(numbers);
        //System.out.println(numbers.toString());
        FindMinMax(numbers);
        FindAverage(numbers);
        }

    public static void randFillList(int count, int maxValue, ArrayList<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < count; i++) list.add(rand.nextInt(maxValue));
    }

    public static ArrayList removeEvens(ArrayList<Integer> list) {
        
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0){
                list.remove(list.get(i));
                i--;
            }
        }
        return list;
    }

    public static void FindMinMax(ArrayList<Integer> list) {
        int minVal = list.get(0);
        int maxVal = list.get(0);
        for (Integer i : list){
            if(i < minVal) minVal = i;
            else if(maxVal < i) maxVal = i;
        }
        System.out.println("min value is " + minVal);
        System.out.println("max value is " + maxVal);
    }
    public static void FindAverage(ArrayList<Integer> list) {
        double sum = 0;
        for (Integer i : list){
            sum += i.doubleValue();
        }
        double average = sum / list.size();
        System.out.println("average of the list is " + average);
    }

}