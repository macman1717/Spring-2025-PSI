package Week_11_Generics.Animals;

public abstract class Reptile extends Animal{
    private boolean isVenomous;

    public Reptile(String name, int ageInYears, String color, boolean isVenomous) {
        super(name, ageInYears, color);
        this.isVenomous = isVenomous;
    }

    public void layEggs(){
        System.out.println("laying eggs");
    }

    public boolean isVenomous() {
        return isVenomous;
    }

    public void setVenomous(boolean venomous) {
        isVenomous = venomous;
    }

}
