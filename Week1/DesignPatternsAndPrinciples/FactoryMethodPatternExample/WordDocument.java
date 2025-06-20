
public class WordDocument implements Document{

    @Override
    public void Open(){
        System.out.println("Opening the Word Document...");
    }

    @Override
    public void Read(){
        System.out.println("Reading the Word Document...");
    }

}
