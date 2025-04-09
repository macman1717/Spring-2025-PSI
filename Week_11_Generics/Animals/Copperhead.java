package Week_11_Generics.Animals;

public class Copperhead extends Snake{
    public Copperhead(String name, int ageInYears, String color, boolean isVenomous) {
        super(name, ageInYears, color, isVenomous);
    }

    @Override
    public void makeNoise() {
        System.out.println("HHHSSSsssss");
    }
}
