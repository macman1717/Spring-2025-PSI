package Week_10_File_IO_Cont;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private long stuID;
    private String name;
    private String major;
    private int earnedCredits;
    private String[] courses;

    public Student() {
    }

    public Student(long stuID, String name, String major, int earnedCredits) {
        this.stuID = stuID;
        this.name = name;
        this.major = major;
        this.earnedCredits = earnedCredits;
    }

    public Student(long stuID, String name, String major, int earnedCredits, String[] courses) {
        this.stuID = stuID;
        this.name = name;
        this.major = major;
        this.earnedCredits = earnedCredits;
        this.courses = courses;
    }

    public long getStuID() {
        return stuID;
    }

    public void setStuID(long stuID) {
        this.stuID = stuID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getEarnedCredits() {
        return earnedCredits;
    }

    public void setEarnedCredits(int earnedCredits) {
        this.earnedCredits = earnedCredits;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuID=" + stuID +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", earnedCredits=" + earnedCredits + '\'' +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }
}
