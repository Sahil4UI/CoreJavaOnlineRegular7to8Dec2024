import java.util.*;

public class linkedHashMapDemo {
    public static void main(String[] args) {
        
        Map<Integer,String> linkedMap = new LinkedHashMap<>();

        linkedMap.put(3,"Three");
        linkedMap.put(4,"Four");
        linkedMap.put(1,"One");
        linkedMap.put(2,"Two");

        // System.out.println(linkedMap.get(2));
        // System.out.println(linkedMap.size());
        // System.out.println(linkedMap.containsKey(2));
        // System.out.println(linkedMap.containsValue("Three"));

        // System.out.println(linkedMap.keySet());
        // System.out.println(linkedMap.values());

        // linkedMap.clear();
        System.out.println(linkedMap);
    }

}
