package Week_11_Generics.Animals;

public class Salamander extends Amphibian{
    public Salamander(String name, int ageInYears, String color) {
        super(name, ageInYears, color);
    }

    @Override
    public void makeNoise(){
        System.out.println("I am a salamander");
    }
}
