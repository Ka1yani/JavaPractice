import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Collection {
    public static void main(String[] args) {
        ArrayList <String> clr = new ArrayList<String>();
        clr.add("Teal");
        clr.add("Saffron");
        clr.add("Magenta");
        clr.add("Occur Yellow");
        clr.add(1, "Blue");

        ArrayList <String> num = new ArrayList<String>();
        num.add("1");
        num.add("2");
        num.add("4");
        num.add("8");

        //To reverse the array
        System.out.println(clr);
        Collections.reverse(clr);
        System.out.println(clr);

        /*To shuffle the array
        System.out.println(clr);
        Collections.shuffle(clr );
        System.out.println(clr);*/


        /* To sort the array
        System.out.println(clr);
        Collections.sort(clr);
        System.out.println(clr);*/

        /* To search the element
        if(clr.contains("White")) System.out.println("Colour is present!");
        else System.out.println("Colour is not present");*/

        /* To replace the element
        String element = clr.set(2, "Black");
        System.out.println(clr);*/

        /* To iterate the array
        Iterator itr = clr.iterator();
        while (itr.hasNext()) System.out.println(itr.next());*/
        }
}

