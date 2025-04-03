package Week_10_File_IO_Cont;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FileIOTester {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(900123456, "Connor Griffin", "Software Development", 148, new String[]{"Soft-Dev 2","Web Development","Artificial Intelligence","Advanced Databases"}));
        students.add(new Student(900111111, "Billy Bob", "Business Management", 74, new String[]{"Intermediate Programming","Intro to Databases","Tennis"}));
        students.add(new Student(900222222, "Elijah Wood", "Data Science", 120, new String[]{"Pre-calc","Intro to Programming"}));
        students.add(new Student(900333333, "Brad Pitt", "Film", 43, new String[]{"Biology", "Badminton", "Algebra"}));

        File studentFile = new File("Week_10_File_IO_Cont/students.txt");
        try(
                FileWriter fileWriter = new FileWriter(studentFile);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
                ){
            for (Student student : students) {
                String line = "";
                line += student.getStuID() + "|";
                line += student.getName() + "|";
                line += student.getMajor() + "|";
                line += student.getEarnedCredits();
                line += "|";
                for(int i = 0; i < student.getCourses().length; i++) {
                    if (i == student.getCourses().length - 1) {
                        line += student.getCourses()[i];
                    }else{
                        line += student.getCourses()[i] + ",";
                    }
                }
                System.out.println(line);
                bufferedWriter.write(line);
                if(student != students.getLast())
                    bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("File IO Exception");
        }

        ArrayList<Student> studentsReadFromFile = new ArrayList<>();
        try(
                Scanner scanner = new Scanner(studentFile);
                ) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\\|");
                long stuID = Long.parseLong(parts[0]);
                String name = parts[1];
                String major = parts[2];
                int credits = Integer.parseInt(parts[3]);
                String[] courses = parts[4].split(",");

                studentsReadFromFile.add(new Student(stuID, name, major, credits, courses));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for(Student student : studentsReadFromFile){
            System.out.println(student);
        }
    }
}
