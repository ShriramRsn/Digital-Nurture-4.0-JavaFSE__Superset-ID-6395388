package DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class BookRepository {

    public BookRepository(){
        System.out.println("Book Repository is created!!!");
    }

    public void bookrepo(){
        System.out.println("Books are stored");
    }
}
