package Week_12_Generic_Classes.Animals;

public class Sheep extends Mammal {


    public Sheep(String name, int ageInYears, String color) {
        super(name, ageInYears, color);
    }

    @Override
    public void makeNoise() {
        System.out.println("Baaaaaah");
    }
}
