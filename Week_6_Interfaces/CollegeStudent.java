package Week_6_Interfaces;

public class CollegeStudent implements Comparable<CollegeStudent>, Cloneable, Athlete{
    private int stuID;
    private String name;
    private String major;
    private int ageInYears;

    public CollegeStudent(int stuID, String name, String major, int ageInYears) {
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
    public int compareTo(CollegeStudent otherStudent) {
        if(this.stuID > otherStudent.stuID){
            return -1;
        }else if(this.stuID < otherStudent.stuID){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public CollegeStudent clone() {
        try {
            CollegeStudent clone = (CollegeStudent) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public void playMatch() {
        System.out.println("Playing Match");
    }
}
