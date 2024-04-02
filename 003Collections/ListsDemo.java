import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListsDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Kalyani");
        names.add("Piyush");
        names.add("Mango");//Adding object in arraylist
        names.add(0, "Apple");

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Grapes");
        //names.addAll(fruits);
        names.addAll(1, fruits);
        System.out.println(names);

        System.out.println(names.get(0));
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Manoj"));
        System.out.println(names.contains("Kalyani"));
        if(names.contains("Kalyani"))
            System.out.println(names.indexOf("Kalyani"));
        String arr[] = names.toArray(new String[names.size()]);
        for(String s : arr ) {
            System.out.println(s);
        }
        names.remove(0);
        names.remove("Piyush");
        System.out.println(names);
        names.set(0, "Sarthak");
        System.out.println(names);
        names.forEach(name -> System.out.println("hello " + name));
        for(String s : names) {
            System.out.println(
                    s
            );
        }
        Iterator itr = names.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Collections.sort(names);
        System.out.println(names);
        System.out.println(names.size());
    }

}
