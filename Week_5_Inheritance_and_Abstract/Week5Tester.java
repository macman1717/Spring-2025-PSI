package Week_5_Inheritance_and_Abstract;

import java.util.ArrayList;
import java.util.List;

public class Week5Tester {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        Dog fiona = new Dog(6, 50.3, "Fiona", "Black", "Greenies", "Georgia", "Standard Poodle");
        Dog pluto = new Dog(94, 41.3, "Pluto", "Yellow", "Biscuits", "California", "Bloodhound");

        listOfAnimals.add(fiona);
        listOfAnimals.add(pluto);

        for(Animal animal : listOfAnimals){
            animal.giveIntroduction();
        }
    }
}
