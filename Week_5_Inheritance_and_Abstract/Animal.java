package Week_5_Inheritance_and_Abstract;

public class Animal {

    private int age;
    private double weight;
    private String name;
    private String color;
    private String diet;
    private String geographicOrigin;
    private boolean vertebrate;

    public Animal() {
    }

    public Animal(int age, double weight, String name, String color, String diet, String geographicOrigin, boolean vertebrate) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.color = color;
        this.diet = diet;
        this.geographicOrigin = geographicOrigin;
        this.vertebrate = vertebrate;
    }

    public void moveAround(){
        System.out.println("I'm moving!!!");
    }

    public void makeNoise(){
        System.out.println("**Animal noises**");
    }

    public void giveIntroduction(){
        System.out.println("My name is " + name + ", I'm from " + geographicOrigin + " and i like to eat " + diet);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("age=").append(age);
        sb.append(", weight=").append(weight);
        sb.append(", name='").append(name).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", diet='").append(diet).append('\'');
        sb.append(", geographicOrigin='").append(geographicOrigin).append('\'');
        sb.append(", vertebrate=").append(vertebrate);
        sb.append('}');
        return sb.toString();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getGeographicOrigin() {
        return geographicOrigin;
    }

    public void setGeographicOrigin(String geographicOrigin) {
        this.geographicOrigin = geographicOrigin;
    }

    public boolean isVertebrate() {
        return vertebrate;
    }

    public void setVertebrate(boolean vertebrate) {
        this.vertebrate = vertebrate;
    }
}
