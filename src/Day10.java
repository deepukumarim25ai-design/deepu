import java.util.LinkedList;

public class Day10 {
    static void main() {
        LinkedList<String> queue = new LinkedList<String>();
        queue.add("Deepu");
        queue.add("Harsha");
        queue.add("Vimla");
        queue.add("Manisha");
        queue.add("Ishika");
        while(!queue.isEmpty()) {
            process(queue);
        }
    }
    static void process(LinkedList<String> queue){
        String removed=queue.removeFirst();
        System.out.println("Removed:"+removed);

    }
}
