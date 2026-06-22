import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class day_13 {
    static void main(){
        Path path = Path.of("src/files", "students.csv");
        try {
            List<String> students = Files.readAllLines(path);

            for (String line : students){
                String[] row =line.split(",");
                for (String s : row) {
                    System.out.println(s + " | ");
                }
                System.out.println();
            }
        }catch (IOException io) {
            io.printStackTrace();
        }
    }
}