package Week_1_Review;

public class Animal {
    String name;
    String species;
    int age;
    double weight;
    String diet;

    public Animal(String name, String species, int age, double weight, String diet) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
        this.diet = diet;
    }

    public void makeNoise(){
        System.out.println("My name is " + name + ", and I am a " + age + " year old " + species);
    }

    public void eatFood(){
        if(diet.contains("Meats") && diet.contains("Plants")){
            System.out.println("nom nom, I'm an omnivore");
        }else if(diet.contains("Plants")){
            System.out.println("nom nom, I'm an herbivore");
        }else{
            System.out.println("nom nom, I'm a carnivore");
        }
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", diet='" + diet + '\'' +
                '}';
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
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

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }
}
