package Week_5_Inheritance_and_Abstract;

public abstract class Mammal extends Animal {

    public Mammal(int age, double weight, String name, String color, String diet, String geographicOrigin){
        super(age,weight, name, color, diet, geographicOrigin, true);
    }

    public void drinkMilk(){
        System.out.println("I love not being lactose intolerant.");
    }

}
