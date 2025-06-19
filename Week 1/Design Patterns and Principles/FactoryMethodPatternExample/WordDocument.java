
public class WordDocument implements Document{

    @Override
    public void Open(){
        System.out.println("Opening the Word Document...");
    }

    @Override
    public void Close(){
        System.out.println("Closing the Word Document...");
    }

}
