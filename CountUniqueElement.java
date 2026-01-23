import java.util.HashSet;

public class CountUniqueElement {
    public static void main(String[] args) {
        int num[] = {4,3,2,5,6,7,3,4,2,1};
        int ans = 7;
        HashSet<Integer> hs = new HashSet<>();
        for(int i:num){
            hs.add(i);
        }
        System.out.println(hs.size());
    }
}
