
public class PdfDocument implements Document {

    @Override
    public void Open(){
        System.out.println("Opening the PDF Document...");
    }

    @Override
    public void Read(){
        System.out.println("Reading the PDF Document...");
    }

}
