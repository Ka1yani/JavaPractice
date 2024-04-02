import java.util.Comparator;
import java.util.Objects;

public class Student implements Cloneable ,Comparable<Student> {
    //Data Members or Instance variables or Fields of class
    private int rollNumber;
    private String name;
    private int standard;
    private char section;
    private float percentageScored;

    private static String headMaster;

   public String someMethod() {
       return headMaster;
   }

    //Constructor
    public Student() {

    }
    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Student(int rollNumber, String name, int standard, char section, float percentageScored) {
        this.rollNumber = rollNumber;
        this.name = name.trim();
        this.standard = standard;
        this.section = section;
        this.percentageScored = percentageScored;
    }

    public Student(int rollNumber, String name, int standard, char section, float percentageScored, String headMaster) {
        this.rollNumber = rollNumber;
        this.name = name.trim();
        this.standard = standard;
        this.section = section;
        this.percentageScored = percentageScored;
        Student.headMaster = headMaster;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public float getPercentageScored() {
        return percentageScored;
    }

    public void setPercentageScored(float percentageScored) {
        this.percentageScored = percentageScored;
    }

    //getters and setters
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    //overriding toString()
    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", standard=" + standard +
                ", section=" + section +
                ", percentageScored=" + percentageScored +
                ", School_HeadMaster=" + headMaster +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && standard == student.standard && section == student.section && Float.compare(percentageScored, student.percentageScored) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    //Comparable Interface compareTo Method Ovveriding
    @Override
    public int compareTo(Student s) {
       if(this.rollNumber == s.rollNumber) {
           return Float.compare(s.percentageScored, this.percentageScored);
       } else  if(this.rollNumber > s.rollNumber) {
           return  1;
       } else return -1;
    }

    //Member Functions
    public String obtainResult() {
        if (this.percentageScored < 40) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

}


class RollNumberComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2){
        if(s1.getRollNumber() ==  s2.getRollNumber()){
            return 0;
        } else if(s1.getRollNumber() > s2.getRollNumber()){
            return 1;
        } else return -1;
    }
}

class PercentageComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2){
        if(s1.getPercentageScored() ==  s2.getPercentageScored()){
            return 0;
        } else if(s1.getPercentageScored() > s2.getPercentageScored()){
            return 1;
        } else return -1;
    }
}
