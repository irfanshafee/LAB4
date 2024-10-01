import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
public class XmlBookReader implements BookReader {
    public List<Book> readBooks(String source) {
        List<Book> books = new ArrayList<>();
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File(source));
            NodeList nodeList = document.getElementsByTagName("book");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);
                String title = element.getElementsByTagName("title").item(0).getTextContent();
                String author = element.getElementsByTagName("author").item(0).getTextContent();
                String genre = element.getElementsByTagName("genre").item(0).getTextContent();
                int pages = Integer.parseInt(element.getElementsByTagName("pages").item(0).getTextContent());
                LocalDate dateRead = LocalDate.parse(element.getElementsByTagName("date_read").item(0).getTextContent());
                books.add(new Book(title, author, genre, pages, dateRead));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }

}