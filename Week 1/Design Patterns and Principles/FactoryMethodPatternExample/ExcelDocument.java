public class ExcelDocument implements Document{
    
    @Override
    public void Open(){
        System.out.println("Opening the Excel Document...");
    }

    @Override
    public void Read(){
        System.out.println("Reading the Excel Document...");
    }
}
