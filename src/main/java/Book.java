
public class Book {

    private String author;
    private String title;
    private String id;
    private String subject;
    private String status;
    private int numberOfPages;

    public Book() {} //Constructor

    public Book(String title, String author, String subject, String id, int numberOfPages, String status) {
        this.title= title;
        this.author= author;
        this.subject= subject;
        this.id= id;
        this.numberOfPages= numberOfPages;
        this.status= status;
    }
    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public int getNumberOfPages() {return numberOfPages;}
    public void setNumberOfPages(int numberOfPages) {this.numberOfPages = numberOfPages;}

    public String getSubject() {return subject;}
    public void setSubject(String subject) {this.subject = subject;}

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}



    public String toString() {
        return "\n Name: " + getTitle() +
                "\n Author: " + getAuthor() +
                "\n Subject: " + getSubject() +
                "\n ISBN: " + getId() +
                "\n Pages: " + getNumberOfPages() +
                "\n Status: " + getStatus();
    }
    //    private BookFormat type;




//    @Override
//    public void add() {
//
//    }
//
//    @Override
//    public void remove() {
//
//    }
}



//interface Item {
//    void print();
//    void add();
//    void remove();
//}
