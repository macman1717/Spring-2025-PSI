package Week_12_Generic_Classes.Animals;


public abstract class Animal implements Comparable<Animal>{

    private String name;
    private int ageInYears;
    private String color;

    public Animal(String name, int ageInYears, String color) {
        this.name = name;
        this.ageInYears = ageInYears;
        this.color = color;
    }

    public abstract void makeNoise();
    public void eat(String food){
        System.out.println("Eating " + food + ", nom nom nom.");
    }

    public void sleep(){
        System.out.println("ZZZZzzzz");
    }

    public void roam(){
        System.out.println("I am moving around!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("name='").append(name).append('\'');
        sb.append(", ageInYears=").append(ageInYears);
        sb.append(", color='").append(color).append('\'');
        return sb.toString();
    }

    @Override
    public int compareTo(Animal o){
        if(this.getName().compareTo(o.getName()) < 0){
            return -1;
        }else if(this.getName().compareTo(o.getName()) > 0){
            return 1;
        }else {
            return this.getAgeInYears().compareTo(o.getAgeInYears());
        }
    }
}
