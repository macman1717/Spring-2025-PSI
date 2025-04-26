package Week_13_Final_Review;

public class RecursionTester {
    public static void main(String[] args) {
        //Write a recursive method to find the sum of the digits of a given integer
        //example: 842 -> 14
        System.out.println(addSum(842));

        //Write a recursive method that returns the given string reversed
        //example: "Connor Griffin" -> "niffirG ronnoC"
        System.out.println(reverseString("Connor Griffin"));

        //Given a string, compute recursively (no loops) the number of "11" substrings in the string.
        //The "11" substrings should not overlap
        //example: "word 1117 11doodle11 1111" -> 5
        System.out.println(numOfElevens("word 1117 11doodle11 1111"));
    }

    public static int addSum(int a){
        if(a == 0){
            return 0;
        }
        return a % 10 + addSum(a / 10);
    }

    public static String reverseString(String s){
        if(s.isEmpty()){
            return "";
        }
        return s.charAt(s.length() - 1) + reverseString(s.substring(0,s.length()-1));
    }

    public static int numOfElevens(String s){
        if(s.isEmpty() || s.length() == 1){
            return 0;
        }
        if(s.charAt(0) == '1' && s.charAt(1) == '1'){
            if(s.length() == 2){
                return 1;
            }
            return 1 + numOfElevens(s.substring(2));
        }
        return 0 + numOfElevens(s.substring(1));
    }
    public static int getFactorial(int n){
        if (n == 0){
            return 1;
        }
        return n * getFactorial(n-1);
    }
}
