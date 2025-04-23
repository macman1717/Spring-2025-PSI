package Week_13_Final_Review;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class CollegeStudentTester {
    public static void main(String[] args) {
        //Read students.txt into array list of strings
        ArrayList<String> students = new ArrayList<String>();
        try(BufferedReader br = new BufferedReader(new  FileReader("Week_13_Final_Review/students.txt"))){
            String currentLine;
            while((currentLine = br.readLine()) != null){
                students.add(currentLine);
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        for(String student : students){
            System.out.println(student);
        }

        //use the array list of strings to create an array list of CollegeStudent objects
        ArrayList<CollegeStudent> collegeStudents = new ArrayList<>();
        for(String student : students){
            String[] studentArray = student.split(",");
            int studentID = Integer.parseInt(studentArray[1].trim());
            int age = Integer.parseInt(studentArray[2].trim());
            String name = studentArray[0].trim();
            String major = studentArray[3].trim();
            CollegeStudent collegeStudent = new CollegeStudent(studentID, name, major, age);
            collegeStudents.add(collegeStudent);
        }
        for(CollegeStudent collegeStudent : collegeStudents){
            System.out.println(collegeStudent);
        }


        //Create an InvalidStudentException
        //Modify the CollegeStudent class, throwing exceptions whenever an invalid action is attempted
        //(setting age to a negative, setting 900 number to a value greater than or less than 9 numbers, etc.)


        //implement cloneable and use clone to create and add another student to the list


        //implement comparable and sort the list


    }

}
