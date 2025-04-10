package Week_11_Generics.Animals;


public class Frog extends Amphibian{
    public Frog(String name, int ageInYears, String color) {
        super(name, ageInYears, color);
    }

    @Override
    public void makeNoise(){
        System.out.println("Ribbet");
    }

}
