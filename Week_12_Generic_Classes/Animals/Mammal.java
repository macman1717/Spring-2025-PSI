package Week_12_Generic_Classes.Animals;

public abstract class Mammal extends Animal {

    public Mammal(String name, int ageInYears, String color) {
        super(name, ageInYears, color);
    }

    public void drinkMilk(){
        System.out.println("I love not being lactose intolerant.");
    }

}
