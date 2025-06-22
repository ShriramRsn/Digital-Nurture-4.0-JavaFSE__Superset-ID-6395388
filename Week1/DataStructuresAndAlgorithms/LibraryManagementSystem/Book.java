public class Book {
    private int Bookid;
    private String Title;
    private String Author;

    public Book(String Author, int Bookid, String Title) {
        this.Author = Author;
        this.Bookid = Bookid;
        this.Title = Title;
    }

    public void setBookid(int bookid) {
        Bookid = bookid;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getBookid() {
        return Bookid;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public String toString() {
        return "\"" + Title + "\" by " + Author;
    }
    
}
