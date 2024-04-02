class EEmployee {
    protected String name;
    protected int id;
    protected String department;
    protected double salary;

    public EEmployee(){
        System.out.println("Hello from EEmployee");
    }

    public EEmployee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.getClass() +  "{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }


    public void displayGift(){
        System.out.println("No Gift Received to Employee");
    }

    public void displayGift(String gift){
        System.out.println("Employee got a : "+ gift);
    }

    public void displayGift(int leave) {
        System.out.println("Employee got a gift of "+ leave +" Leaves");
    }

    public void displayGift(String gift, double amount) {
        System.out.println("Employee got a : " + gift + " gift of Amount : "+ amount);
    }
}


class Manager extends EEmployee{

    public Manager(){
        super();//this is implicit call
        System.out.println("Hello from Manager");
    }
    public Manager(String name, int id, String department, double salary) {
        super(name, id, department, salary);
        System.out.println("Hello from Overloaded Manager 4");
    }
}


class Developer extends EEmployee {
    String technology;
    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public Developer(){

    }

    public Developer(String name, int id, double salary, String technology){
        super(name, id,"", salary);
        this.department = "IT";
        this.technology = technology;
    }


    @Override
    public String toString() {
        return this.getClass() + "{" +
                "technology='" + technology + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void displayGift(int leave){
        System.out.println("Developer has got a gift of "+ leave + " Bugs :)");
    }


}

public class InheritanceDemo {
    public static void main(String[] args) {
        /*EEmployee e1 = new EEmployee("Aman", 1, "General", 10000.00);
        System.out.println(e1.toString());

        Manager m1 = new Manager("Prashant", 1001, "General", 50000.00);
        System.out.println(m1.toString());

        Developer d1 = new Developer("Bhuvan", 101, 25000.00, "Java");
        System.out.println(d1.toString());

        e1.displayGift();
        e1.displayGift("Flower");
        e1.displayGift(3);
        e1.displayGift("Cash", 1000);
        e1.displayGift("Amazon Voucher", 500);


        d1.displayGift();
        d1.displayGift("Flower");
        d1.displayGift(3);
        d1.displayGift("Cash", 1000);
        d1.displayGift("Amazon Voucher", 500);*/



        EEmployee emp = new Developer();
        emp.displayGift(5);
        emp = new EEmployee();
        emp.displayGift(5);

    }
}
