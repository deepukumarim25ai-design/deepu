import java.util.ArrayList;
public class Day10 {
    public static void main(){
        ArrayList<String> students = new ArrayList<>();
        students.add("Joseph");
        students.add("Subasree");
        students.add("Vishnu");
        students.add("Archana");
        students.add("Srinithi");
        System.out.println("Student List:");
        for (String s : students) {
            System.out.println(s);
        }
        students.remove("Archana");
        System.out.println("\nAfter Removing Archana:");
        for (String s : students) {
            System.out.println(s);
        }
    }
}


