abstract class AbstractClass {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void displayHello();
    abstract String sayMyName(String name);
}

class ImplementAbstractClass extends AbstractClass{

    @Override
    void displayHello() {

    }

    @Override
    String sayMyName(String name) {
        return null;
    }
}


public class AbstractDemo {
    public static void main(String[] args) {
        ImplementAbstractClass iac = new ImplementAbstractClass();
        iac.displayHello();
        System.out.println(iac.sayMyName("Kalyani"));
        iac.setId(1);
        System.out.println("IAC id : "+ iac.getId());
    }
}
