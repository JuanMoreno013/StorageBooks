import java.time.LocalDate;

public class Letter extends ItemOp {


    private final String title;
    private final LocalDate dateWrite;


    public Letter(String title, String author, int pages, LocalDate dateWrite) {
        super(author, pages);
        this.title = title;
        this.dateWrite = dateWrite;

    }

    public String getTitle() {return title;}
    public LocalDate getDateWrite() {return dateWrite;}

    public String toString() {
        return
                 "\n Title: " + getTitle() +
                 "\n Date: " + getDateWrite() +
                 super.toString();
    }
}
