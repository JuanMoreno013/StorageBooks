import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;


public abstract class ItemOp {

    private int id ;
    private final int pages;
    private final String author;
    private final String title;
    private final LocalDate dateWrite;


    public ItemOp(String title, String author , int pages, LocalDate dateWrite){

        validate(title, author, pages, dateWrite);

        this.id= randomNumber();
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.dateWrite = dateWrite;
    }

    private int randomNumber(){  //generate random number to id

        int size = 2000;
        int i;
        Random rand = new Random();

        //Stream.generate(() -> (new Random()).nextInt(10)).distinct().limit(10);
        return i = rand.nextInt(size - 1 + 1) + 1;
    }
    public int getId(){return id;}
    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public int getPages() {return pages;}
    public LocalDate getDateWrite() {return dateWrite;}

     public void ValidationP(Object... arrayOfObj){
       // array.foreach -> validate.
         //if (obj == null) ??
        for (Object obj: arrayOfObj) {
            if (obj == null) {
                throw new IllegalArgumentException();
            }
        }
     }
    private void validate(String title, String author , int pages, LocalDate dateWrite) {
        ValidationP(title, author, dateWrite);

        if (title.isBlank())
            throw new IllegalArgumentException(" Blank title");

        if (author.isBlank())
            throw new IllegalArgumentException(" Author Blank");

        if (dateWrite.isAfter(LocalDate.now()))
            throw new IllegalArgumentException("Date wrong");

        if (pages < 1)
        throw new IllegalArgumentException( "Error Pages! ");
    }
    public String toString() {
        return
                "\n Title: " + getTitle() +
                "\n Author: " + getAuthor() +
                "\n Pages: " + getPages() +
                "\n Date: " + getDateWrite() ;
    }
}
