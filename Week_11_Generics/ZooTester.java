package Week_11_Generics;

import Week_11_Generics.Animals.*;

import java.util.ArrayList;

public class ZooTester {
    public static void main(String[] args) {

        ArrayList<Animal> zoo = new ArrayList<>();

        zoo.add(new Dog("Fiona", 4, "Black", true));
        zoo.add(new Panda("Po", 16, "White and Black"));
        zoo.add(new RedPanda("Priya", 2, "Red and White"));

        ArrayList<Dog> kennel = new ArrayList<>();
        kennel.add(new Dog("Fiona", 5, "Black", true));
        kennel.add(new Dog("Bruce", 3, "Chocolate", true));
        kennel.add(new Dog("Glory", 8, "Yellow", true));

        ArrayList<Snake> listOfSnakes = new ArrayList<>();
        listOfSnakes.add(new Copperhead("Steve",12,"Copper",false));
        listOfSnakes.add(new Copperhead("Jeff",5,"Copper",false));
        listOfSnakes.add(new BallPython("Randy",4,"Copper",false));

        ArrayList<Amphibian> listOfAmplibians = new ArrayList<>();
        listOfAmplibians.add(new Frog("Bob",5,"green"));
        listOfAmplibians.add(new Salamander("Alice",7,"purple"));
        listOfAmplibians.add(new Frog("Katherine",5,"Red"));

        playWithAnimals(zoo);
//        playWithAnimals(kennel);
//        playWithAnimals(listOfSnakes);
//        playWithAnimals(listOfAmplibians);
    }

    private static void playWithAnimals(ArrayList<Animal> listOfAnimals){
        for(Animal animal : listOfAnimals){
            System.out.println("Playing with " + animal.getName());
        }
    }

    private static void playWithAnimal(Animal animal){
        System.out.println("Playing with " + animal.getName());
    }
}
