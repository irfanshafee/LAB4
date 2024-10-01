public class BookReaderFactory {
    public static BookReader getBookReader(String format) {
        switch (format.toLowerCase()) {
            case "csv":
                return new CsvBookReader();
            case "json":
                return new JsonBookReader();
            case "xml":
                return new XmlBookReader();
            default:
                throw new IllegalArgumentException("Unknown format: " + format);
        }
    }
}
