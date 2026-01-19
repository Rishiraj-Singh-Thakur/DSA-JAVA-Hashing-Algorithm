import java.util.*;

public class ItretionInHashMap{
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put( "us",1);
        hm.put("china",2);
        hm.put( "russia",3);
        hm.put( "india",4);
        System.out.println(hm);

        //Itrations
        Set<String> keys = hm.keySet();

        for (String k : keys) {
            System.out.println("key ="+k+",value="+hm.get(k));
        }
    }
}