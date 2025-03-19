package Week_7_Exceptions;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTester {
    public static void main(String[] args) {

        try {
            int stuID = getStuID();

            System.out.println(stuID);
            int x = 75/0;
            System.out.println(x);

            System.out.println("Caught InputMismatchException");
            System.out.println("Caught ArithmeticException");
            System.out.println("Goodbye!");
        }catch (InputMismatchException e){
            System.out.println("Input MismatchException");
        }
        catch (Exception e) {
            System.out.println("Caught Exception");
        }

        finally {
            System.out.println("Goodbye!");
        }

        try {
            File file = new File("text.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));

        }catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }

    public static int getStuID() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a student ID: ");
        return input.nextInt();
    }
}
