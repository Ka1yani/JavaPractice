public class EmployeDetails {
    public static void main(String[] args) {
        Employee e1 = new Employee("IBM", "samiksha", 12, 58000 );
        System.out.println(e1.toString());
        Employee.main(new String[]{"FirstArg"});
    }
}


class Employee {
    private String companyName;
    private String name;
    private int empId;
    private int salary;

    public static void main(String[] args) {
        System.out.println("Hello");
    }

    public Employee(String companyName, String name, int empId, int salary) {
        this.companyName = companyName;
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", empId=" + empId +
                ", salary=" + salary +
                '}';
    }
}
