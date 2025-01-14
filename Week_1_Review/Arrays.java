package Week_1_Review;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {7,12,33,14,5,6,87,8,19};

        System.out.println(numbers[0]);
        System.out.println(numbers[4]);
        System.out.println(numbers[8]);

        int sum = numbers[0] + numbers[1] +numbers[2] +numbers[3];
        System.out.println(sum + "\n");

        sum = 0;
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
            sum += numbers[i];
        }
        System.out.println();
        int enhancedSum = 0;
        for(int num : numbers){
            System.out.print(num + " ");
            enhancedSum += num;
        }

        System.out.println("\nSum of numbers: " + sum);
    }
}
