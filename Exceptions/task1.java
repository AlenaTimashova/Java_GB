package Homeworks.Exceptions;
//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class task1 {
    public static void main(String[] args) {
//        division(10,0);
//        int[] array = {1, 3, 5, 4};
//        printValueByIndex(array, 5);
        String[] lines = {"hello", null, "world"};
        printStringArray(lines);

    }

    public static void division(double firstNum, double secondNum){
        if(secondNum ==  0) throw new ArithmeticException("На ноль делить нельзя!");
        double result = firstNum/secondNum;
        System.out.printf("Результат деления %f на %f равен %f.\n", firstNum, secondNum, result);
    }

    public static void printValueByIndex(int[] array, int index){
        if(index > array.length-1) throw new ArrayIndexOutOfBoundsException("Элемента под таким индексом не существует");
        else System.out.printf("Элемент с индексом %d равен %d.\n",index, array[index]);
    }

    public static void printStringArray(String[] sArray){
        for (String item: sArray){
            if(item == null) throw new NullPointerException("Ошибка! Элемент отсутствует.");
            System.out.println(item);
        }
    }
}