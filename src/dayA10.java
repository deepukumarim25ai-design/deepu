import java.util.LinkedList;

public class dayA10 {
    static void process(LinkedList<String> list) {
        System.out.println("Removed : " + list.removeFirst());
    }
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("101 -deepu- 90");
        list.add("102 - harsha - 78");
        list.add("103 - nishant - 94");
        list.add("104 - vimla - 92");
        list.add("105 - manu - 91");
        System.out.println("Student List:");
        System.out.println(list);
        list.add("106 -isha- 98");
        System.out.println("\nAfter Adding:");
        System.out.println(list);
        process(list);
        System.out.println("\nAfter Removing:");
        System.out.println(list);
        list.set(2,"104 - vimla - 92");
        System.out.println("\nAfter Updating:");
        System.out.println(list);
    }
}