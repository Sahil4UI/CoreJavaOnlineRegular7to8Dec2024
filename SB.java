public class SB {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World");
        sb.insert(0, "Java");
        sb.replace(0, 4 ,"Python");
        sb.delete(0, 6);
        sb.reverse();
        System.out.println(sb.capacity());
    }
}
