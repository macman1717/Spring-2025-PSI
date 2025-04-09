package Week_11_Generics.Animals;

public class Panda extends Mammal{
    public Panda(String name, int ageInYears, String color) {
        super(name, ageInYears, color);
    }

    @Override
    public void makeNoise() {
        System.out.println("I freaking love Bamboo!");
    }
}
