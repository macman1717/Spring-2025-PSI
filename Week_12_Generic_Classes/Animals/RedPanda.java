package Week_12_Generic_Classes.Animals;

public class RedPanda extends Panda {

    public RedPanda(String name, int ageInYears, String color) {
        super(name, ageInYears, color);
    }

    @Override
    public void makeNoise() {
        System.out.println("I am the cutest, and I'm not fat like my parent class");
    }

}
