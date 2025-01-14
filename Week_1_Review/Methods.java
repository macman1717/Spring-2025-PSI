package Week_1_Review;

public class Methods {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
    }

    public void displayNumbers(int num1, int num2, int num3){
        System.out.println("Numbers: " + num1 + " " + num2 + " " + num3);
    }

    public int sumTwoNumbers(int num1, int num2){
        return num1 + num2;
    }

    public int multiplyTwoNumbers(int num1, int num2){
        return num1 * num2;
    }
}
