import java.util.*;
public class HashSetJava {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(2);
        System.out.println(hs);
        if(hs.contains(3)){
            System.out.println("yes");
        }else{
            System.out.println("noh");
        }
        hs.remove(3);
        if(hs.contains(3)){
            System.out.println("yes");
        }else{
            System.out.println("noh");
        }
    }
}
