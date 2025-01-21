package Week_2_ObjectOrientedProgramming;

public class Student {
    private String fName;
    private String lName;
    private int creditsEarned;
    private int stuID;
    private static int count = 0;
    private String major;

    public Student(String fName, String lName, int creditsEarned, int stuID, String major) {
        count++;
        this.fName = fName;
        this.lName = lName;
        this.creditsEarned = creditsEarned;
        this.stuID = stuID;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", creditsEarned=" + creditsEarned +
                ", stuID=" + stuID +
                ", major='" + major + '\'' +
                '}';
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getCreditsEarned() {
        return creditsEarned;
    }

    public void setCreditsEarned(int creditsEarned) {
        this.creditsEarned = creditsEarned;
    }

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
