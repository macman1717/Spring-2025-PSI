package Week_10_File_IO_Cont;

import java.io.*;
import java.util.ArrayList;

public class FileIOTester {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(900123456, "Connor Griffin", "Software Development", 148));
        students.add(new Student(900111111, "Billy Bob", "Business Management", 74));
        students.add(new Student(900222222, "Elijah Wood", "Data Science", 120));
        students.add(new Student(900333333, "Brad Pitt", "Film", 43));

        File studentFile = new File("students.txt");
        try(
                FileWriter fileWriter = new FileWriter(studentFile);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
                ){
            for (Student student : students) {
                String line = "";
                line += student.getStuID() + ",";
                line += student.getName() + ",";
                line += student.getMajor() + ",";
                line += student.getEarnedCredits();
                System.out.println(line);
                bufferedWriter.write(line);
                if(student != students.getLast())
                    bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("File IO Exception");
        }
    }

}
