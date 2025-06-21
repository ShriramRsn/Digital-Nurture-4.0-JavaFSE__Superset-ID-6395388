public class Main {
    public static void main(String[] args) {
        DocumentFactory factory;
        String type = "word";

        if (type.equalsIgnoreCase("word")) {
            factory = new WordDocumentFactory();
        } else if (type.equalsIgnoreCase("pdf")) {
            factory = new PDFDocumentFactory();
        } else {
            factory = new ExcelDocumentFactory();
        }

        Document doc = factory.createDocument(); 
        doc.Open();
        doc.Read();
    }
}
