
import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // set cannot store duplicate values

        set.add("Apple");
        set.add("Banana");
        set.add("Grapes");
    

        // set.remove("Apple");

        // set.clear();

        // System.out.println(set.size());

        for (String x : set) {
            System.out.println(x);
        }
    }
}
