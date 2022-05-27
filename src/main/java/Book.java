import java.time.LocalDate;

public class Book extends ItemOp {

    private final String id;
    private final String subject;
    private final String status;
    private final String editorial;

    public Book(String title, String author, int pages, LocalDate dateWrite, String subject, String id, String editorial, String status) {

        super(title, author, pages, dateWrite);
        validate(id,subject,status,editorial);

        this.subject= subject;
        this.id= id;
        this.editorial= editorial;
        this.status= status;
    }

    public void ValidationP(Object... arrayOfObj){
        // array.foreach -> validate.
        //if (obj == null) ??
        for (Object obj: arrayOfObj) {
            if (obj == null) {
                throw new IllegalArgumentException();
            }
        }
    }
    private void validate(String subject, String id, String editorial, String status) {
        ValidationP(id, subject, status, editorial);

        if (subject.isBlank())
            throw new IllegalArgumentException("Book: Blank Subject");

        if (status.isBlank())
            throw new IllegalArgumentException("Book: Status is Blank");

        if (id.isBlank())
            throw new IllegalArgumentException("Book: ISBN es Blank ");

        if (editorial.isBlank())
            throw new IllegalArgumentException("Book: Editorial is Blank");
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
