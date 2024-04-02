import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class School {
    public static void main(String[] args) {
        Student s3 =new Student(3,"Chandan   ", 6, 'A', 54.2f, "Padmaja Marathe");
        Student s4 =new Student(4,"Dinesh   ", 6, 'A', 98.87f);
        Student s1 = new Student(1,"Aditya", 6, 'A', 82.1f, "Samiksha Jamodkar");
        Student s8 = new Student(1,"Aditi", 6, 'A', 98.55f, "Samiksha Jamodkar");
        Student s2 =new Student(2,"Bhuvan   ", 6, 'A', 89.7f);

        System.out.println(s1.getName());
        System.out.println(s1.getRollNumber());
        System.out.println(s1.getStandard());
        System.out.println(s1.getSection());
        System.out.println(s1.getPercentageScored());
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        s2.setPercentageScored(90.2f);
        System.out.println(s2);
        System.out.println(s3.toString());

        Student s6 = new Student(1,"Aditya", 6, 'A', 82.1f, "Samiksha Jamodkar");
        Student s5 = null;
        try{
            s5 = s1.clone();
        } catch(CloneNotSupportedException err) {
            System.out.println("Cannot clone Student" +  err.getMessage());
        }

        System.out.println(s1.equals(s5));
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList(
                "Mango", "Banana", "Orange",  "Grape",
                "Pineapple", "Apple", "Strawberry", "Watermelon", "Cherry", "Kiwi"
        ));
        Collections.sort(fruits);
        System.out.println(fruits);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s3);
        studentList.add(s1);
        studentList.add(s4);
        studentList.add(s2);
        studentList.add(s8);
        //Collections.sort(studentList);
        //System.out.println(studentList);
        //System.out.println(s3.compareTo(s1));
        Collections.sort(studentList, new RollNumberComparator());
        System.out.println(studentList);
        Collections.sort(studentList, new PercentageComparator());
        System.out.println(studentList);
    }

    static {
        System.out.println("This will be executed first");
    }
}
