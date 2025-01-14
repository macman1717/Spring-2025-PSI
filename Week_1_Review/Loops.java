package Week_1_Review;

public class Loops {
    public static void main(String[] args) {
        boolean marker = true;
        int x = 1;
        while (marker){
            System.out.println("Inside loop 1 : " + x);
            x++;
        }

        while (!marker){
            System.out.println("Inside loop 2 : " + x);
        }

        int i = 0;
        while (i < 10){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for(int j = 0; j < 10; j++){
            System.out.print(j + " ");
        }
    }
}
