import java.time.LocalDate;
import java.util.Objects;

public abstract class ItemOp {

    private final int pages;
    private final String author;
    private final String title;
    private final LocalDate dateWrite;


    public ItemOp(String title, String author , int pages, LocalDate dateWrite){

        validate(title, author, dateWrite);

        this.title = title;
        this.author = author;
        this.pages = pages;
        this.dateWrite = dateWrite;
    }

    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public int getPages() {return pages;}
    public LocalDate getDateWrite() {return dateWrite;}

     public void validate(Object... arrayOfObj){
       // array.foreach -> validate.
         //if (obj == null) ??
        for (Object obj: arrayOfObj) {
            if (obj == null) {
                throw new IllegalArgumentException();
            }
        }
     }

    public String toString() {
        return
                "\n Title: " + getTitle() +
                "\n Author: " + getAuthor() +
                "\n Pages: " + getPages() +
                "\n Date: " + getDateWrite() ;
    }
}
