import java.util.PriorityQueue;

public class priorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.offer(30);
        pq.add(20);

        // peek
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.remove(20);
        System.out.println(pq);
        
    }
}
