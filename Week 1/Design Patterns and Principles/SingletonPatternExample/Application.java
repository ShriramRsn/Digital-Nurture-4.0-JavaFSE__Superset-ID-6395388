public class Application {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        System.out.println("Logger1 and Logger2 refer to the same object: " + (logger1 == logger2));
    }
}
