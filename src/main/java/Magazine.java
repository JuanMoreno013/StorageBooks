import java.time.LocalDate;

public class Magazine extends ItemOp{


    private final int volume;
    private final String subject;
    private final String editorial;

    public Magazine(String title, String author, int pages, LocalDate dateWrite, String subject, int volume, String editorial )
    {
        super(title, author, pages, dateWrite);

        this.volume=volume;
        this.subject=subject;
        this.editorial=editorial;
    }

    public int getVolume() {
        return volume;
    }
    public String getSubject() {return subject;}
    public String getEditorial() {return editorial;}

    public String toString() {
        return
                super.toString() +
                "\n Subject: " + getSubject() +
                "\n Volume: " + getVolume() +
                "\n Editorial: " + getEditorial();
    }

}
