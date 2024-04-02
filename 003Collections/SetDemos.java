import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemos {
    public static void main(String[] args) {
       HashSet<String> hs = new HashSet<>();
       hs.add("apple");
       hs.add("banana");
       hs.add("orange");
       hs.add("banana");
       System.out.println("HashSet is : "+ hs);
    }
}
