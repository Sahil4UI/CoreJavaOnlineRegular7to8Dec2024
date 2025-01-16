
// collections - list,hasmap,sets

import java.util.ArrayList;
import java.util.List;

class ListDemo{
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Pineapple");
        list.add("Litchi");

        // System.out.println(list.size());

        // list.remove(0);
        // System.out.println(list.size());

        // list.clear();
        // System.out.println(list.size());
        // System.out.println("Element at index 1 : "+list.get(1));

        // list.set(2, "Pineapple");
        // System.out.println(list);

        // System.out.println(list.contains("Orange"));

        // for (String x:list)
        // {
        //     System.out.print(x+ ",");
        // }

        // System.out.println(list.lastIndexOf("Apple"));

        // sublist
        // ending - n-1
        List<String> subList = list.subList(0, 2);
        System.out.println(subList);

        System.out.println(list.isEmpty());

    }
}