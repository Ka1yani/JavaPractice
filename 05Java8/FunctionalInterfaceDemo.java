
@FunctionalInterface
interface MaxFinder {
    int findMax(int num1, int num2);
}

//Instead of this we can use a Lambda Expression to provide an implementation of the Functional Interface
class MaxFinderImpl implements MaxFinder {
    @Override
    public int findMax(int num1, int num2) {
        return Math.max(num1, num2);
    }
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        /*MaxFinder maxFinder = new MaxFinderImpl();
        int result = maxFinder.findMax(20,30);
        System.out.println("Max is "+ result);*/

        MaxFinder maxFinder = (num1, num2) -> Math.max(num1, num2); //The return type of Lambda Expression is a Functional interface
                                                                   // (or to be specific a Lambda Function represents instance of a Functional Interface
        int result = maxFinder.findMax(10,15);
        System.out.println("Max is "+ result);
    }
}


