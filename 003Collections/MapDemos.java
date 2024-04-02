import java.util.*;

public class MapDemos {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        // void clear()
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        System.out.println("Before clearing, HashMap: " + hashMap);
        hashMap.clear();
        System.out.println("After clearing, HashMap: " + hashMap);

        // boolean isEmpty()
        System.out.println("Is HashMap empty? " + hashMap.isEmpty());
        hashMap.put(1, "Apple");
        System.out.println(hashMap.get(1).hashCode());
        hashMap.put(2, "Banana");
        hashMap.put(26, "Zuccini");
        hashMap.put(3, "Cherry");
        System.out.println("HashMAp :: "+ hashMap);
        hashMap.remove(2);
        System.out.println("HashMAp :: "+ hashMap);
        System.out.println("HashMap contains 26 "+  hashMap.containsKey(26));
        System.out.println("HashMap contains Apple "+  hashMap.containsValue("Apple"));

        System.out.println("Hashmap get 0 " + hashMap.get(0));
        System.out.println("Hashmap get 3 " + hashMap.get(3));
        System.out.println("Hashmap getOrDefault 0 " + hashMap.getOrDefault(0, "Not Present in the HM"));

        hashMap.put(8,"Grapes");
        hashMap.put(2,"Banana");
        System.out.println("HashMAp :: "+ hashMap);

        hashMap.put(8, "Pear");
        System.out.println("HashMAp :: "+ hashMap);

        hashMap.putIfAbsent(1, "Apricot");
        System.out.println("HashMAp :: "+ hashMap);

        HashMap<Integer, String> anotherMap = new HashMap<>();
        anotherMap.put(3, "Cherry");
        anotherMap.put(4, "Date");

        hashMap.putAll(anotherMap);
        System.out.println("HashMAp :: "+ hashMap);

        System.out.println("is Hashmap equal to AnotherMap "+ hashMap.equals(anotherMap));

        Set<Map.Entry<Integer, String>> hmapEntries = hashMap.entrySet();
        System.out.println("HashMap Entries are :: " + hmapEntries);

        Set<Integer> keySet = hashMap.keySet();
        System.out.println("HashMap KeySet is :: " + keySet);

        Collection<String> hashMapValues =  hashMap.values();
        System.out.println("HashMap KeySet is :: " + hashMapValues);

        hashMap.forEach((key, value) -> {
            System.out.print("\n Key :: " + key);
            System.out.print(" Value :: " + value);
        });
        System.out.println();
        Iterator itr = hashMap.entrySet().iterator();
        while(itr.hasNext()) {
            System.out.println( itr.next());
        }


        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Apple", 60);


        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();

    }
}
