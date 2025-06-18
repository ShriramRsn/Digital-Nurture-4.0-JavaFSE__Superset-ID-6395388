
public class PdfDocument implements Document {

    @Override
    public void Open(){
        System.out.println("Opening the PDF Document...");
    }

    @Override
    public void Close(){
        System.out.println("Closing the PDF Document...");
    }

}
