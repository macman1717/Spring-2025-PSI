package Week_11_Generics.Animals;

import java.util.ArrayList;
import java.util.Collections;

public class PolymorphismAnimalsTester {
    public static void main(String[] args) {

        ArrayList<Animal> zoo = new ArrayList<>();

        zoo.add(new Dog("Fiona",4,"Black",true));
        zoo.add(new Panda("Po",16,"White and Black"));
        zoo.add(new RedPanda("Priya",2,"Red and White"));
        zoo.add(new Frog("Kermit",69,"Green"));
        zoo.add(new Salamander("Fiona",3,"Black and Yellow"));
        zoo.add(new Copperhead("Bob", 14, "Copper", true));


        for(Animal animal : zoo){
            pokeAnimal(animal);
        }

        System.out.println("BEFORE SORT");
        for(Animal animal: zoo){
            System.out.println((animal));
        }

        Collections.sort(zoo);
        System.out.println();

        System.out.println("AFTER SORT");
        for(Animal animal: zoo){
            System.out.println((animal));
        }

        System.out.println();
       ArrayList<Pet> pets = new ArrayList<>();
       pets.add(new Dog("Adi", 5, "brown",true));

       for(Pet pet : pets){
           playWithPet(pet);
       }

    }

    public static void pokeAnimal(Animal animal){
        animal.makeNoise();
    }

    public static void playWithPet(Pet pet){
        pet.playWithOwner();
    }
}
