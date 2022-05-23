public class ItemOp {

    private static int pages;
    private static String author;

    public ItemOp(String author , int pages){
        this.author = author;
        this.pages = pages;
    }

    public static String getAuthor() {
        return author;
    }

    public static int getPages() {
        return pages;
    }

    public String toString() {
        return
                "\n Author: " + getAuthor() +
                "\n Pages: " + getPages() ;
    }
}
