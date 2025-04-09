package Week_11_Generics;

import Week_11_Generics.Animals.Animal;

import java.util.ArrayList;

public class Zoo<E extends Animal> {
    private ArrayList<E> listOfAnimals;
    private int numOfEnclosures;
    private int numOfAnimals;

    public Zoo() {
        this.listOfAnimals = new ArrayList<>();
        this.numOfEnclosures = 0;
        this.numOfAnimals = 0;
    }

    private boolean spaceAvailable(){
        return numOfEnclosures > numOfAnimals;
    }

    public void add(E animal){
        if(spaceAvailable()) {
            listOfAnimals.add(animal);
        }else{
            System.out.println("No space available for this animal. Consider building another inclosure.");
        }
    }

    public void remove(int index){
        listOfAnimals.remove(index);
        numOfAnimals--;
    }

    public void buildEnclosure(){
        this.numOfEnclosures++;
    }

    public void destroyEnclosure(){
        this.numOfEnclosures--;
    }

    public int getNumOfEnclosures() {
        return numOfEnclosures;
    }

    public int getNumOfAnimals() {
        return numOfAnimals;
    }

}
