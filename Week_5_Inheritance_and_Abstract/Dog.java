package Week_5_Inheritance_and_Abstract;

public class Dog extends Mammal implements Pet {
    String breed;

    public Dog(int age, double weight, String name, String color, String diet, String geographicOrigin, String breed){
        super(age,weight, name, color, diet, geographicOrigin);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("BARK BARK BARK BARK!");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", breed=" + breed;
    }

}
