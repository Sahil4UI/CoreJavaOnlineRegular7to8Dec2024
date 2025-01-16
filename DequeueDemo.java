import java.util.*;

public class DequeueDemo {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Apple");
        deque.addFirst("Banana");
        deque.addLast("Orange");
        deque.addFirst("Cheeku");
        System.out.println(deque);


        // getFirst and getLast
        // System.out.println(deque.getFirst());
        // System.out.println(deque.getLast());

        // removeFirst & removeLast
        System.out.println(deque.pollFirst());
        System.out.println(deque.size());


    }
}
