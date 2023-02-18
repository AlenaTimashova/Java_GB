package Homeworks.HW_2;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
/*Дана строка (получение через обычный текстовый файл!!!)

"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"

Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика. */
import java.util.Scanner;

public class task2 {
   
    public static void main(String[] args) {
        Path path = Paths.get("D:\\GeekBrains\\Java\\Homeworks\\HW_2\\task2.txt");
 
        try {
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            for (String line  : lines) {
                PrintLine(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void PrintLine(String someStr) {
        String line1 = someStr.replace("\"", "").replace(":", ",");
        String[] data = line1.split(",");
        System.out.printf("Студент %s получил %s по предмету %s \n", data[1],data[3],data[5]);

    }
   
}
