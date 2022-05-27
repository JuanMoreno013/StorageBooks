import java.time.LocalDate;

public class Letter extends ItemOp {
    private final String subject;
    private final String place;

    public Letter(String title, String author, int pages, LocalDate dateWrite, String subject, String place) {
        super(title, author, pages, dateWrite);
        validate(subject,place);

        this.subject = subject;
        this.place = place;

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
    private void validate(String subject, String place) {
        ValidationP(subject, place);

        if (subject.isBlank())
            throw new IllegalArgumentException("Blank Subject");

        if (place.isBlank())
            throw new IllegalArgumentException("Place is Blank");
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
