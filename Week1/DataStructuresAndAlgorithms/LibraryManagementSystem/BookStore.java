public class BookStore {
    public static void main(String[] args) {
        ManagerBook manager = new ManagerBook();
        LinearSearch search = new LinearSearch();
        String title = "The Alchemist";

        Book result = search.linearSearch(manager.books, title);

        if (result != null) {
            System.out.println(result.getAuthor() + " - \"" + result.getTitle() + "\" is available.");
        } else {
            System.out.println("Book not available.");
        }

        manager.sortBooksByTitle();
        BinarySearch bsearch = new BinarySearch();
        int result1 = bsearch.binarySearch(manager.books, title);

        if (result1 != -1) {
            Book found = manager.books[result1];
            System.out.println(found.getAuthor() + " - \"" + found.getTitle() + "\" is available (Binary Search).");
        } else {
            System.out.println("Book not available (Binary Search).");
        }
    }
}
