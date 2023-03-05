package Homeworks.HW_6;


//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
public class Laptop {
    String name;
    int ram;
    int storageCap;
    String os;
    String colour;

    @Override
    public String toString() {
        
        return this.name;
    }

    public void getInfo() {
        System.out.printf("name: %s, ram: %d, storage: %d, os: %s, color: %s", this.name, this.ram, this.storageCap, this.os, this.colour);
    }

    public Laptop(String name, int ram, int storageCap, String os, String colour) {
        this.name = name;
        this.ram = ram;
        this.storageCap = storageCap;
        this.os = os;
        this.colour = colour;
    }

    public Laptop() {
        this.name = null;
        this.ram = 0;
        this.storageCap = 0;
        this.os = null;
        this.colour = null;
    }
}

