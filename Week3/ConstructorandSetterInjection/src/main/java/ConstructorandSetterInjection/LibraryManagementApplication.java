package ConstructorandSetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public LibraryManagementApplication(){
        System.out.println("Library is created!!!");
    }
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = container.getBean("BookService",BookService.class);
        bookService.bookservice();
    }
}
