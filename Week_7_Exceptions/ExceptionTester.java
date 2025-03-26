package Week_7_Exceptions;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTester {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a name: ");
            String name = input.nextLine();

            if (name.trim().isEmpty()) {
                throw new BlankNameException("Name cannot be empty");
            }
        }catch (BlankNameException e) {
            System.out.println("Caught BlankNameException");
        }
        catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }



        System.out.println("Done");

    }
}
