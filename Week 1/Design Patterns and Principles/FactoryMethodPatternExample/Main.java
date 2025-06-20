public class Main {
    public static void main(String[] args) {
        DocumentFactory factory;

        //Word Document
        factory = new WordDocumentFactory();
        Document word = factory.createDocument();
        word.Open();
        word.Read();

        //PDF Document
        factory = new PDFDocumentFactory();
        Document pdf = factory.createDocument();
        pdf.Open();
        pdf.Read();

        //Excel Document
        factory = new ExcelDocumentFactory();
        Document excel = factory.createDocument();
        excel.Open();
        excel.Read();
    }
}
