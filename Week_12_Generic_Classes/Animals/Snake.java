package Week_12_Generic_Classes.Animals;

public abstract class Snake extends Reptile {
    public Snake(String name, int ageInYears, String color, boolean isVenomous) {
        super(name, ageInYears, color, isVenomous);
    }

    public abstract String playWithOwner();
}
