import java.util.List;

public class PrintBooks {



    public void displayAll(List <Book> books)
    {
        for ( Book nwbook: books) {
            System.out.println(
                    "\n Name: " + nwbook.getTitle() +
                    "\n Author: " + nwbook.getAuthor() +
                    "\n Subject: " + nwbook.getSubject() +
                    "\n ISBN: " + nwbook.getId() +
                    "\n Pages: " + nwbook.getNumberOfPages() +
                    "\n Status: " + nwbook.getStatus());
//            System.out.println();
        }
    }

    public void displaySingle(Book books)
    {
        System.out.println(books.toString());
    }


//    public void displayAll(Book[] books)
//    {
//        for ( Book nwbook: books) {
//            System.out.println(
//                    "\n Name: " + nwbook.getTitle() +
//                    "\n Author: " + nwbook.getAuthor() +
//                    "\n Subject: " + nwbook.getSubject() +
//                    "\n ISBN: " + nwbook.getId() +
//                    "\n Pages: " + nwbook.getNumberOfPages() +
//                    "\n Status: " + nwbook.getStatus());
////            System.out.println();
//        }
//    }
}

    //public Book(String title, String author, String subject, String id, int numberOfPages, String status) {
