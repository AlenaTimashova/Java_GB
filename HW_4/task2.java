package Homeworks.HW_4;
/* Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя. */

import java.util.LinkedList;

public class task2 {
    
    public static void main(String[] args) {
        LinkedList <Integer> numbers = new LinkedList<> ();
        FillList(numbers);
        
    }
    public static void FillList(LinkedList <Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
    }
    public static void enqueue(LinkedList <Integer> list, int element) { //помещает элемент в конец очереди
        list.addLast(element);
    }
    public static int dequeue(LinkedList <Integer> list) { //возвращает первый элемент из очереди и удаляет его
        return list.pollFirst();
    }
    public static int first(LinkedList <Integer> list) { //возвращает первый элемент из очереди, не удаляя. 
        return list.peekFirst();
    }
}
