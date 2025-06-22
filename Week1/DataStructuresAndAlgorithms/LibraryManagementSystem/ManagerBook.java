import java.util.Arrays;
import java.util.Comparator;

public class ManagerBook {
    Book[] books = {new Book("Francesc Miralles and Hector Garcia", 12, "Ikigai"),
                    new Book("Paulo Coelho", 43, "The Alchemist"),
                    new Book(" James Clear", 39, "Atomic Habits")};

    public void sortBooksByTitle() {
        Arrays.sort(books, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
    }
}
