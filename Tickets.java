import java.util.HashMap;

public class Tickets {
    public static String getStart(HashMap<String,String> ticket){
        HashMap<String,String> revMap = new HashMap<>();
        for(String key : ticket.keySet()){
            revMap.put(ticket.get(key), key);
        }
        for(String key : ticket.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> ticket = new HashMap<>();
        ticket.put("chennai", "bengluru");
        ticket.put("mumbai", "delhi");
        ticket.put("goa", "channai");
        ticket.put("delhi", "goa");

        String start = getStart(ticket);
        System.out.print(start);

        for(String key: ticket.keySet()){
            System.out.print("->"+ ticket.get(start));
            start = ticket.get(start);
        }
        System.out.println();;
    }
}
