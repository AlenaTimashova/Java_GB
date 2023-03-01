package Homeworks.HW_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности Имени. */
public class task2 {
    public static void main(String[] args) {
        String[] employees  = new String[] {
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Мария Рыкова",
            "Марина Лугова",
            "Анна Владимирова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов"}; 

        String[] employeeNames = getNames(employees);
        HashMap <String, Integer> counted = countRepeatedNames(employeeNames);
        System.out.println(countRepeatedNames(employeeNames));
        
        sortName(counted);
         
    }
    public static String[] getNames(String[] array) {
        String[] names = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            names[i] = array[i].split(" ")[0];
        }
        return names;
    }
   
    public static HashMap<String, Integer> countRepeatedNames(String[] array) {
        HashMap<String, Integer> repeatNameCount = new LinkedHashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (repeatNameCount.containsKey(array[i])) {
                repeatNameCount.put(array[i], repeatNameCount.get(array[i]) + 1);
            } else {
                repeatNameCount.put(array[i], 1);
            }
        }
        return repeatNameCount;
    }
    public static void sortName(HashMap<String, Integer> map){
        Map<Integer, ArrayList<String>> sortMap = new HashMap<>();
        ArrayList<Integer> listCount = new ArrayList<>();
        for(var item: map.entrySet()) {
            if (listCount.contains(item.getValue()) == false) listCount.add(item.getValue());
        }
        listCount.sort(null);
        for (int i = listCount.size()-1; i > -1; i--){
            for (var item: map.entrySet()){
                if (listCount.get(i) == item.getValue()) System.out.printf("%s : %d \n", item.getKey(), item.getValue());
            }
        }
    }
}
