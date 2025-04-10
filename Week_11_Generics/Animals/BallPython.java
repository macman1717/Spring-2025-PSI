package Week_11_Generics.Animals;


public class BallPython extends Snake {
    public BallPython(String name, int ageInYears, String color, boolean isVenomous) {
        super(name, ageInYears, color, isVenomous);
    }

    @Override
    public void makeNoise() {
        System.out.println("I am a Ball Python, Slither!!!");
    }

    @Override
    public String playWithOwner() {
        return "I'm wrapping around my owner's hand.";
    }
}
