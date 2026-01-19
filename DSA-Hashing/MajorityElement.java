import java.util.HashMap;
import java.util.Set;

public class MajorityElement {
    public static void main(String[] args) {
        HashMap<Integer ,Integer> map = new HashMap<>();
        int arr [] = {1,3,2,5,1,3,1,5,1};

        for(int elem :arr){
            if(map.containsKey(elem)){
                map.put(elem, map.get(elem)+1);
            }
            else{
                map.put(elem , 1);
            }
        }
        Set<Integer> keys = map.keySet();
        for(int key : keys){
            if(map.get(key)>arr.length/3){
                System.out.println(key);
            }
        }
    }
}
