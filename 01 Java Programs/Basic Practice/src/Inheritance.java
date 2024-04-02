class Vehicle {
    protected String brand;
    protected String colour;

    public Vehicle(String brand, String colour) {
        this.brand = brand;
        this.colour = colour;
    }
    public void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Colour: " + colour);
    }
}
class Car extends Vehicle {
    private int year;

    public Car(String brand, String colour, int year) {
        super(brand, colour);
        this.year= year;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Year: " + year);
    }
}
public class Inheritance{
    public static void main(String[] args) {
        Car car= new Car("VW","red",2024);
        car.display();
    }
}