import java.util.*;
class QueueDemo{
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        // FIFO - FIrst In First Out;
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        System.out.println(queue);

        queue.offer("Strawberry");
//         // removing first element
//         // System.out.println(queue.poll());
        System.out.println(queue.size());
// // peek - viewing first element
//         System.out.println(queue.peek());
        // System.out.println(queue.element());

    }
}