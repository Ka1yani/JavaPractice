class Animal {
    public void animalSound(String voice) {
        System.out.println("Animal have different sounds!");
    }
}
class Dog extends Animal {
    public void animalSound(String voice,int legs) {
        System.out.println("Dog Voice: " + voice);
        System.out.println("Dog Legs: " + legs);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Dog a = new Dog();
        a.animalSound("Bark", 4);
    }
}





















