import java.util.ArrayList;

public class AddBook implements ItemOpe{

    //public Book[] adbo = new Book[2];

//    ArrayList<Book> abdo = new ArrayList<Book>();

    ManageBooks mgBook;

    //Book


    @Override
    public void add(ArrayList<Book> abdo) {
        //Book 1
        String title = "Preparing bool", author= "Nikki Lauda", subject= " Terror ", id= "123-2",  status= "New";
                int npages= 938;
        //Book 2
        String title2 = "Solid ", author2= "Kristal Karl", subject2= " Drama ", id2= "938-9-11",  status2= "New";
        int npages2= 128;


        //mgBook.adBook.Book.getTitle();



        if ( title == null || title2 == null || title.isBlank() || title2.isBlank() ){
            try {
                throw new BookException(" \n Fail! Your put something wrong, the name of your book can not to be null ");

            } catch (BookException e) {
                System.out.println("Something went wrong! " + e.getMessage());
            }
        } else {
            abdo.add( new Book(title, author, subject, id, npages, status));
            abdo.add(new Book(title2, author2, subject2, id2, npages2, status2));

        }



    }

//        adbo[0] = new Book("Calm", "Esteban Ocon", "Terror", "123-2", 938, "New");



    public void opera(ArrayList<Book> adb, int selectIndex) {
        //not implement yet
        System.out.println(" \n Enter de book name: ");
        String title = "";  //




//        Book book = new Book (title, author, subject, id, pages, "free");


//
//        String title = null;  //
//        if (title == null) {
//
//            try {
//                adbo[0] = new Book(title, "Esteban Ocon", "Terror", "123-2", 938, "New");
//
//                throw new BookException("Fail \" " + title + " \" Your put something wrong");
//
//            } catch (BookException e) {
//                System.out.println("Something went wrong! " + e.getMessage());
//            }
//        }

        //System.out.println("Successfully added!");
//    }


    }
}


