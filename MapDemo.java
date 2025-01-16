import java.util.*;
public class MapDemo {
    // map contains key:value pair
    // key cannot be duplicate
    public static void main(String[] args) {
        
        Map<String,String> map = new HashMap<>();
        // map.put("A","Apple");
        map.put("B","Banana");
        map.put("D","Date");
        map.put("C","Cherry");

        map.putIfAbsent("A","Apricot");

        // update
        // map.put("D","DryFruit");

        // System.out.println(map.get("B"));

        // System.out.println(map.containsKey("A"));
        // System.out.println(map.size());
        // System.out.println(map.isEmpty());

        // map.computeIfAbsent("E", key -> "Elderberry");

        // map.merge("A", "Almond", (oldValue, newValue) -> oldValue + " and " + newValue);

        map.clear();

        for (Map.Entry<String,String> x:map.entrySet())
        {
            System.out.println(x.getKey()+" : "+x.getValue());
        }



    }
}
