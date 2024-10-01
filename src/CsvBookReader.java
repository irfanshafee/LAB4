import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CsvBookReader implements BookReader {
    public List<Book> readBooks(String source) {
        List<Book> books = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(source))) {
            String line;
            // Skip header line
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                books.add(new Book(values[0], values[1], values[2], Integer.parseInt(values[3]), LocalDate.parse(values[4])));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }
}

