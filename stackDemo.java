import java.util.*;

public class stackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Litchi");

        // System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.search("Apple"));
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());



    }
}
