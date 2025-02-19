package Week_6_Interfaces;

import java.util.ArrayList;

public class InterfaceTester {
    public static void main(String[] args) {
        CollegeStudent stan = new CollegeStudent(900121212,"Stan", "Soft-Dev", 19);
        CollegeStudent terrance = new CollegeStudent(900556677,"Terrance", "Systems & Security", 27);

        CollegeStudent stanCopy = stan;
        CollegeStudent terranceCopy = terrance;

        stanCopy.setMajor("Art");
        terranceCopy.setMajor("Business");

        ArrayList<CollegeStudent> list = new ArrayList<>();
        list.add(stan);
        list.add(stanCopy);
        list.add(terrance);
        list.add(terranceCopy);

        for(CollegeStudent student : list){
            System.out.println(student);
        }

        list.add(new CollegeStudent(903212223, "Emma", "3D Modeling", 27));
        list.add(new CollegeStudent(900112233, "Alice", "Computer Science", 20));
        list.add(new CollegeStudent(901878889, "Quinn", "Bioinformatics", 22));
        list.add(new CollegeStudent(902212223, "Umar", "Ethical Hacking", 24));
        list.add(new CollegeStudent(900990011, "Ivy", "Robotics", 21));
        list.add(new CollegeStudent(902434445, "Wendy", "Autonomous Systems", 26));
        list.add(new CollegeStudent(903989900, "Lucas", "Systems Analysis", 23));
        list.add(new CollegeStudent(900778899, "Grace", "Human-Computer Interaction", 22));
        list.add(new CollegeStudent(902878889, "Ava", "Data Visualization", 24));
        list.add(new CollegeStudent(903656667, "Isabella", "IoT", 21));
        list.add(new CollegeStudent(901101112, "Jack", "Machine Learning", 26));
        list.add(new CollegeStudent(902323334, "Victor", "UI/UX Design", 22));
        list.add(new CollegeStudent(901434445, "Mia", "Web Development", 20));
        list.add(new CollegeStudent(903434445, "Gina", "Database Management", 25));
        list.add(new CollegeStudent(901212223, "Karen", "Cloud Computing", 22));
        list.add(new CollegeStudent(902545556, "Xavier", "Quantum Computing", 21));
        list.add(new CollegeStudent(901545556, "Noah", "Game Development", 19));
        list.add(new CollegeStudent(902656667, "Yasmine", "Cryptography", 23));
        list.add(new CollegeStudent(900445566, "David", "Data Science", 23));
        list.add(new CollegeStudent(900334455, "Charlie", "Cybersecurity", 21));
        list.add(new CollegeStudent(902090011, "Sam", "Mobile App Development", 23));
        list.add(new CollegeStudent(901989900, "Rachel", "Software Testing", 21));
        list.add(new CollegeStudent(903101112, "Derek", "Virtual Reality", 19));
        list.add(new CollegeStudent(900667788, "Frank", "Artificial Intelligence", 24));
        list.add(new CollegeStudent(901767778, "Paul", "Cyber-Physical Systems", 27));
        list.add(new CollegeStudent(903545556, "Harry", "Security Engineering", 26));
        list.add(new CollegeStudent(900889900, "Hank", "Network Administration", 25));
        list.add(new CollegeStudent(903090011, "Cindy", "Edge Computing", 20));
        list.add(new CollegeStudent(901323334, "Leo", "Big Data Analytics", 23));
        list.add(new CollegeStudent(903767778, "Jake", "Neural Networks", 22));
        list.add(new CollegeStudent(903878889, "Kylie", "Software Architecture", 24));
        list.add(new CollegeStudent(902989900, "Brian", "Cloud Security", 22));
        list.add(new CollegeStudent(902101112, "Tina", "Data Engineering", 25));
        list.add(new CollegeStudent(903323334, "Felix", "Game Design", 23));
        list.add(new CollegeStudent(902767778, "Zane", "Blockchain Technology", 25));
        list.add(new CollegeStudent(904090011, "Monica", "Multimedia Design", 22));
        list.add(new CollegeStudent(903212223, "Emma", "3D Modeling", 27));

//        for(CollegeStudent student : list){
//            System.out.println(student);
//        }
    }
}
