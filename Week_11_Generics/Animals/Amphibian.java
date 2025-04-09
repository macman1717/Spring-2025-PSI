package Week_11_Generics.Animals;

public abstract class Amphibian extends Animal{
    private String bloodTemp;

    public Amphibian(String name, int ageInYears, String color) {
        super(name, ageInYears, color);
        bloodTemp = "Cold Blooded";
    }

    public String getBloodTemp() {
        return bloodTemp;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(super.toString());
        sb.append(", bloodTemp='").append(bloodTemp).append('\'');
        return sb.toString();
    }
}
