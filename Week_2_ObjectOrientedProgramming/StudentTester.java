package Week_2_ObjectOrientedProgramming;

public class StudentTester {
    public static void main(String[] args) {
        System.out.println();

        Student connor = new Student("Connor", "Griffin", 130, 900123456, "Software Development");
        Student bob = new Student("Bob", "Saget", 43, 900654321, "Art");
        Student katherine = new Student("Katherine", "Supic", 163, 900112233, "Psychology");

        System.out.println("Number of students: " + bob.getCount());
        System.out.println("Number of students via static reference: " + Student.getCount());

        Student george = connor;
        System.out.println("Connor's toString " + connor);
        System.out.println("George's toString after copy: " + george);

        System.out.println();

        george.setfName("George");
        george.setlName("Lopez");
        george.setMajor("Film");
        george.setCreditsEarned(43);
        george.setStuID(900111111);

        System.out.println("George's toString after changes: " + george);
        System.out.println("Connor's toString " + connor);

        System.out.println("Student count: " +Student.getCount());
    }

}
