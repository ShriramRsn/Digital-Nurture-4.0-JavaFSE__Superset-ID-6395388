public class ExcelDocument implements Document{
    
    @Override
    public void Open(){
        System.out.println("Opening the Excel Document...");
    }

    @Override
    public void Close(){
        System.out.println("Closing the Excel Document...");
    }
}
