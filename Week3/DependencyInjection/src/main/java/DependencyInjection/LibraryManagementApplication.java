package DependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//@Configuration
//@ComponentScan("DependencyInjection")
@SpringBootApplication
public class LibraryManagementApplication {
    public LibraryManagementApplication(){
        System.out.println("LibraryManagementApplication is created!!!");
    }
    public static void main(String[] args) {
//      ApplicationContext container = new AnnotationConfigApplicationContext(LibraryManagementApplication.class);
//        SpringApplication springApplication = new SpringApplication(LibraryManagementApplication.class);
//        ApplicationContext container = springApplication.run();
//        BookService bookService = container.getBean(BookService.class);
//        bookService.bookservice();

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = container.getBean("bookService", BookService.class);
        bookService.bookservice();

    }
}
