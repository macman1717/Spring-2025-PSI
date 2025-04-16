package Week_12_Generic_Classes.Animals;


public class Frog extends Amphibian {
    public Frog(String name, int ageInYears, String color) {
        super(name, ageInYears, color);
    }

    @Override
    public void makeNoise(){
        System.out.println("Ribbet");
    }

}
