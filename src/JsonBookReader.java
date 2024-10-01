import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JsonBookReader implements BookReader {
    public List<Book> readBooks(String source) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(Files.readAllBytes(Paths.get(source)), new TypeReference<List<Book>>() {});
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
