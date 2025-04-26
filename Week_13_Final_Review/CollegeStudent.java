package Week_13_Final_Review;

public class CollegeStudent implements Comparable<CollegeStudent>, Cloneable {
    private int stuID;
    private String name;
    private String major;
    private int ageInYears;

    public CollegeStudent(int stuID, String name, String major, int ageInYears) throws InvalidStudentException {
        //Invalid Student Exception Logic
        if(ageInYears < 0 || ageInYears > 120){
            throw new InvalidStudentException("Age must be between 0 and 120");
        }
        if(stuID < 900000000 || stuID > 999999999){
            throw new InvalidStudentException("Student ID must be between 900000000 and 999999999");
        }
        this.stuID = stuID;
        this.name = name;
        this.major = major;
        this.ageInYears = ageInYears;
    }

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
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

    public int getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("FinalReview.CollegeStudent{");
        sb.append("stuID=").append(stuID);
        sb.append(", name='").append(name).append('\'');
        sb.append(", major='").append(major).append('\'');
        sb.append(", ageInYears=").append(ageInYears);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public CollegeStudent clone() throws CloneNotSupportedException {
        return (CollegeStudent) super.clone();
    }

    @Override
    public int compareTo(CollegeStudent o) {
        return this.name.toLowerCase().compareTo(o.name.toLowerCase());
    }

}
