package Homeworks.HW_4;

import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
public class task1 {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList <>();
        myList.add("hello");
        myList.add("hi");
        myList.add("world");
        myList.add("java");
        myList.add("task");
        System.out.println(myList);
        System.out.println(ReverseList(myList));
        
    }
    public static LinkedList<String> ReverseList(LinkedList<String> list) {
        LinkedList<String> reverseList = new LinkedList<>();
        
        while (!list.isEmpty()) {
            reverseList.add(list.pollLast());
        }
        return reverseList;
    }
}