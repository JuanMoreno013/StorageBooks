import java.time.LocalDate;

public class ItemOp {

    private final int pages;
    private final String author;
    private final String title;
    private final LocalDate dateWrite;



    public ItemOp(String title, String author , int pages, LocalDate dateWrite){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.dateWrite = dateWrite;
    }

    public String getTitle() {return title;}

    public String getAuthor() {return author;}

    public int getPages() {
        return pages;
    }

    public LocalDate getDateWrite() {return dateWrite;}

    public String toString() {
        return
                "\n Author: " + getAuthor() +
                "\n Pages: " + getPages() ;
    }
}
