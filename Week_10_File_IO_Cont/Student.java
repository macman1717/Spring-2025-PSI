package Week_10_File_IO_Cont;

import java.util.ArrayList;

public class Student {
    private long stuID;
    private String name;
    private String major;
    private int earnedCredits;

    public Student() {
    }

    public Student(long stuID, String name, String major, int earnedCredits) {
        this.stuID = stuID;
        this.name = name;
        this.major = major;
        this.earnedCredits = earnedCredits;
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
}
