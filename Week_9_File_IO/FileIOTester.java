package Week_9_File_IO;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileIOTester {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("Week_9_File_IO/numbers.txt"));
            String line = scanner.nextLine();
            String[] strNums = line.split(" ");
            int[] nums = new int[strNums.length];
            for (int i = 0; i < strNums.length; i++) {
                nums[i] = Integer.parseInt(strNums[i]);
            }

            System.out.println(line);


        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
