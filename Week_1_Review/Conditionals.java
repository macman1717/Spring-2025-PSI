package Week_1_Review;

public class Conditionals {
    public static void main(String[] args) {
        boolean trueMarker = true;
        boolean falseMarker = false;

        if(trueMarker){
            System.out.println("1");
        }
        if(falseMarker){
            System.out.println("2");
        }
        if(trueMarker && falseMarker){
            System.out.println("3");
        }
        if(trueMarker || falseMarker){
            System.out.println("4");
        }
        if(!trueMarker){
            System.out.println("5");
        }
        if(!falseMarker){
            System.out.println("6");
        }
        if(falseMarker == trueMarker){
            System.out.println("7");
        }
        if(falseMarker != trueMarker){
            System.out.println("8");
        }
    }
}
