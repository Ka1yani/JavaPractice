import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {
    public static void main(String[] args) {
        //Sources of Stream

        //1: Using Stream.of method
        Stream<Integer> intStream = Stream.of(5,6,7,8,134,16,17,19,23,14,56,78);

        //2: Using Arrays.stream method
        Integer[] intValArray = new Integer[]{10,93, 67, 88, 78, 34,56,78,14,456,12,78,123};
        Stream<Integer> intStreamFromArray =  Arrays.stream(intValArray);

        //3: Collection interface stream and parallel Stream methods
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(5);
        integerList.add(14);
        integerList.add(89);
        integerList.add(33);
        Stream<Integer> integerListStream = integerList.stream();

        List<Integer> evenNumbers = intStream.filter( num -> num %2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        //List<String> evenOdd = intStreamFromArray.map(num -> num%2 == 0?"Even":"Odd").collect(Collectors.toList());
        //System.out.println(evenOdd);

        //integerListStream.forEach(System.out::println);
        /*Long greaterCount = intStreamFromArray.filter(num-> num>50).count();
        System.out.println("Number of numbers that are greater than 50 " + greaterCount);*/
        int evenSum = Arrays.stream(intValArray)
                                .filter(num -> num %2 == 0)
                                .reduce((a,b) -> a+b).get();
        int oddSum = Arrays.stream(intValArray)
                .filter(num -> num %2 != 0)
                .reduce((a,b) -> a+b).get();
        System.out.println("sum of all even numbers is : " + evenSum);
        System.out.println("sum of all odd numbers is : " + oddSum);

        Map<Integer, Integer>  groupBySumEvenOdd = Arrays.stream(intValArray)
                .collect(Collectors.groupingBy(num -> num%2, Collectors.summingInt(Integer::intValue)));
        System.out.println("Sum of even numbers: " + groupBySumEvenOdd.get(0));
        System.out.println("Sum of odd numbers: " + groupBySumEvenOdd.get(1));
    }
}
