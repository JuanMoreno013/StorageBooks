import java.time.LocalDate;

public class Letter extends ItemOp {
    private final String subject;
    private final String place;

    public Letter(String title, String author, int pages, LocalDate dateWrite, String subject, String place) {
        super(title, author, pages, dateWrite);
        this.subject = subject;
        this.place = place;

    }
    public String getSubject() {return subject;}
    public String getPlace() {return place;}

    public String toString() {
        return
                 super.toString()+
                 "\n Subject: " + getSubject() +
                 "\n Place: " + getPlace();

    }
}
