import java.util.ArrayList;

public class ManageBooks {

    AddBook adBook = new AddBook();
    PrintBooks ptBook = new PrintBooks();
    RemoveBook rmBook = new RemoveBook();

    AddMegazine adMag = new AddMegazine();
public void Books(){

    var arr = new ArrayList<Book>(); //ArrayList to manipulate all books


    int remove = 0;

    adBook.add(arr); //add book
    System.out.println("Storage of Books: " );
    ptBook.displayAll(arr);

    rmBook.opera(arr, remove );  //remove
    ptBook.displayAll(arr);   //print all books

    //rmBook.remove(arr);
    }

    public void Magazines()
    {
        var megarr= new ArrayList<Megazine>();


        //var meg = new Megazine();


        String title = "Topic Asus", author= "Maximilian Zeel";
        int npages= 26, volume=3;

        System.out.println("Storage of Magazines: " );
        adMag.add(megarr,title,author,npages,volume);
    }

//    public void MagazineNew()
//    {
//
//
//      // String StMagazine= (title, author)-> title + author;
//
//    }
}
