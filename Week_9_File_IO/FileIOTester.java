package Week_9_File_IO;

import java.io.*;
import java.util.*;

public class FileIOTester {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();

        File file = new File("src/IO/spongebob.txt");
        File file2 = new File("src/IO/file2.txt");

        try {
            Scanner scanner = new Scanner(file);

            FileWriter file2Writer = new FileWriter(file2);
            BufferedWriter bufferedWriter = new BufferedWriter(file2Writer);

            while(scanner.hasNext()){
                lines.add(scanner.nextLine());
            }

            for(int i = lines.size() - 1; i >= 0; i--){
                bufferedWriter.write(lines.get(i));
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            scanner.close();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        for(String line : lines) {
            System.out.println(line);
        }

        recursion(5);

    }


    public static void recursion(int x){
        if(x == 0) return;
        System.out.println("Hello");
        recursion( x - 1);
    }
}
