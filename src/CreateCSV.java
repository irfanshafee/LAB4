import java.io.FileWriter;
import java.io.IOException;

public class CreateCSV{
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("Books.csv")) {
            writer.append("title,author,genre,pages,date_read\n");
            writer.append("Atomic Habits,James Clear,Self-Help,320,2023-02-14\n");
            writer.append("The Hobbit,J.R.R. Tolkien,Fantasy,310,2023-03-01\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


