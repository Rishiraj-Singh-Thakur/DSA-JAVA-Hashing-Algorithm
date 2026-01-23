import java.util.HashSet;
import java.util.Iterator;

public class IteretionOnHashSet {
    public static void main(String[] args) {
        HashSet<String> hs  = new HashSet<>();
        hs.add("Delhi");
        hs.add("Mumbai");
        hs.add("Noida");
        hs.add("Benglore");

        // Iterator it = hs.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }
        for(String city :hs){
            System.out.println(city);
        }
    }
}
