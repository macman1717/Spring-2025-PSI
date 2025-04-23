package Week_12_Generic_Classes;

import Week_11_Generics.Animals.*;

import java.util.ArrayList;

public class Week12Tester {
    public static void main(String[] args) {
        Dog dog = new Dog("Fiona", 4, "Black", true);
        Panda panda = new Panda("Po", 16, "White and Black");
        RedPanda redPanda = new RedPanda("Priya", 2, "Red and White");
        Frog frog = new Frog("Bob",5,"green");
        Salamander salamander = new Salamander("Alice",7,"purple");
        Frog frog2 = new Frog("Katherine",5,"Red");

        Box<Animal> box = new Box<>();
        box.setItem(frog);

        System.out.println(box.getItem().getName());

    }
}
