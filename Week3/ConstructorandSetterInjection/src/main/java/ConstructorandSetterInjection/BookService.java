package ConstructorandSetterInjection;

public class BookService {
    public BookRepository bookRepo;
    public BookService(BookRepository bookRepo){
        System.out.println("Book Service is created!!!");
        this.bookRepo = bookRepo;
        System.out.println("Book Service is created via constructor");
    }

    public void setBookrepo(BookRepository bookRepo){
        this.bookRepo = bookRepo;
        System.out.println("Book Service is created via setter");
    }

    public void bookservice(){
        System.out.println("Books are managed here.");
        bookRepo.bookRepo();
    }
}
