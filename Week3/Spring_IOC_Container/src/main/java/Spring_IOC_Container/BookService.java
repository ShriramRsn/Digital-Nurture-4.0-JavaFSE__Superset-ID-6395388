package Spring_IOC_Container;

import org.springframework.stereotype.Component;

@Component
public class BookService {
    private BookRepository bookrepo;

    public BookService(){
        System.out.println("Book Service is created!!!");
    }

    public void setBookRepo(BookRepository bookrepo){
        System.out.println("\"DI using setter method\"");
        this.bookrepo = bookrepo;
    }

    public void bookservice(){
        System.out.println("Books are managed");
        bookrepo.bookrepo();
    }

}
