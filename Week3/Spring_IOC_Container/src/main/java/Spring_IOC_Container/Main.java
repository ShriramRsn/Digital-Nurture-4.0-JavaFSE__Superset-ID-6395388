package Spring_IOC_Container;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public Main(){
        System.out.println("Main is created!!!");
    }
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = container.getBean("BookService", BookService.class);
        bookService.bookservice();

    }
}
