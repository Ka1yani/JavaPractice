public class Encapsulation {
    public static void main(String[] args) {
        Person person= new Person();
        person.setName("Samiksha");
        person.setAge(26);

        System.out.println("Person Name: " + person.getName());
        System.out.println("Person Age:             " + person.getAge());
    }
}


class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public String setName(String name) {
        this.name = name;
        return name;
    }
    public int getAge() {
        return age;
    }
    public int setAge(int age) {
        if(age >=0){
            this.age=age;
        }
        else{
            System.out.println("Age should not negative");
        }
        return age;
    }
}