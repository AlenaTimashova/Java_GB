package Homeworks.HW_6;

import java.util.ArrayList;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Laptop notebook1 = new Laptop();
        notebook1.name = "Huawei";
        notebook1.colour = "black";
        notebook1.os = "Windows 10";
        notebook1.ram = 16;
        notebook1.storageCap = 128;

        Laptop notebook2 = new Laptop ("Apple", 8, 256, "MacOS", ",белый");
        Laptop notebook3 = new Laptop ("Irbis", 2, 32, "Windows 10", "черный");
        Laptop notebook4 = new Laptop ("DEXP Aquilon", 4, 128, "Windows 11", "серебряный");
        Laptop notebook5 = new Laptop ("ASUS VivoBook", 16, 512, "Windows 10", "черный");
        
        ArrayList <Laptop> notebooks = new ArrayList<>();
        notebooks.add(notebook5);
        notebooks.add(notebook4);
        notebooks.add(notebook3);
        notebooks.add(notebook2);
        notebooks.add(notebook1);

        sayHello();
        Scanner iScanner = new Scanner(System.in);
        int userChoice = iScanner.nextInt();
        Choice(userChoice, notebooks);

        iScanner.close();
    
     }

    public static void sayHello() {
        System.out.println("Приветствуем Вас в нашем магазине ноутбуков.");
        System.out.println("Выберите паметр поиска:\n 1. Операционная система\n 2. ОЗУ\n 3. Объем жесткого диска\n 4.Цвет");
    }

    public static void Choice(int number, ArrayList<Laptop> notebooks) {
        int result = 0;
        String [] opSystem = {"MacOS", "Windows 10", "Windows 11"};
        int[] ramOptions = {2, 4, 8, 16};
        int[] storageOptions = {32, 128, 256, 512};
        String[] colorOptions = {"черный", "белый", "серебряный"};
        Scanner sc = new Scanner(System.in);
        switch (number) {
            case 1:
                System.out.print("Введите 1 для MacOs, 2 для Windows 10, 3 для Windows 11:  ");
                result = sc.nextInt();
                for (Laptop element : notebooks) {
                    if(element.os.equals(opSystem[result-1])) {
                        element.getInfo();
                        System.out.println();
                    }
            } 
                break;
            case 2:
                System.out.print("Варианты ОЗУ: 1. 2\n 2. 4\n 3. 8\n 4. 16. Ваш выбор: ");
                result = sc.nextInt();
                for (Laptop element : notebooks) {
                    if(element.ram == (ramOptions[result-1])) {
                        element.getInfo();
                        System.out.println();
                    }
                }
                break;
            case 3:
                System.out.print("Варианты объема жесткого диска: 1. 32\n 2. 128\n 3. 256\n 4. 512. Ваш выбор: ");
                result = sc.nextInt();
                for (Laptop element : notebooks) {
                    if(element.storageCap == (storageOptions[result-1])) {
                        element.getInfo();
                        System.out.println();
                    }
                }
                break;
            case 4:
                System.out.print("Выберите цвет: 1. черный 2. белый 3. серебряный: ");
                result = sc.nextInt();
                for (Laptop element : notebooks) {
                    if(element.colour.equals(colorOptions[result-1])) {
                        element.getInfo();
                        System.out.println();
                    }
                }
                break;
            default:
            System.out.println("Что-то пошло не так. Попробуйте ещё раз.");
                sayHello();
                break;
        }
        sc.close();
        
    }

}


