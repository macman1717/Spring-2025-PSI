package Week_1_Review;

import java.util.ArrayList;

public class Objects {
    public static void main(String[] args) {
        ArrayList<Animal> listOfAnimals = new ArrayList<>();
        Animal panda = new Animal("Po","Panda Bear",22,260.3,"Plants and Meats");
        Animal lion = new Animal("Simba", "Lion", 6, 455.5, "Meats");
        Animal deer = new Animal("Bambi","White-tailed deer", 3, 151.2,"Plants");

        listOfAnimals.add(panda);
        listOfAnimals.add(lion);
        listOfAnimals.add(deer);
        System.out.println();
        for(Animal animal : listOfAnimals){
            System.out.println(animal);
            animal.makeNoise();
            animal.eatFood();
            System.out.println();
        }
    }
}
