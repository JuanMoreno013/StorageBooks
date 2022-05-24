import java.time.LocalDate;

public class Book extends ItemOp {

    private String id;
    private String subject;
    private String status;
    private String editorial;

    public Book(String title, String author, int pages, LocalDate dateWrite, String subject, String id, String editorial, String status) {
        super(title, author, pages, dateWrite);

        this.subject= subject;
        this.id= id;
        this.editorial= editorial;
        this.status= status;
    }

    public String getId() {return id;}
    public String getSubject() {return subject;}
    public String getStatus() {return status;}
    public String getEditorial() {return editorial;}

    public String toString() {
        return
                super.toString()+
                "\n Subject: " + getSubject() +
                "\n ISBN: " + getId() +
                "\n Editorial: " + getEditorial() +
                "\n Status: " + getStatus();
    }
}
