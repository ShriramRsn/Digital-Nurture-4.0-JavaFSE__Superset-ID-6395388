package DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class BookService {
//    @Autowired
    public BookRepository bookRepo;

    public BookService(){
        System.out.println("Book Service is created!!!");
    }

//    @Autowired
//    public void setBookRepo(BookRepository bookRepo) {
//        this.bookRepo = bookRepo;
//    }
    public void setBookRepo(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    public void bookservice(){
        System.out.println("Books are managed");
        bookRepo.bookrepo();
    }
}
