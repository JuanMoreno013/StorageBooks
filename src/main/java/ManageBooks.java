import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class ManageBooks {

   ///// BOOK /////
    AddBook adBook = new AddBook();
    PrintBooks ptBook = new PrintBooks();
    RemoveBook rmBook = new RemoveBook();

    /////// MAGAZINES///
    AddMegazine adMag = new AddMegazine();
    PrintMagazines ptMagazin = new PrintMagazines();
    RemoveMagazines rmMagazin = new RemoveMagazines();

    /////// LETTER///

    AddLetter adLet = new AddLetter();
    PrintLetter ptLet = new PrintLetter();
    RemoveLetter rmLet = new RemoveLetter();


public void Books(){

    var arr = new ArrayList<Book>(); //ArrayList to manipulate all books


    int remove = 5;

    adBook.add(arr); //add book
    System.out.println("Storage of Books: " );
    ptBook.displayAll(arr);

    rmBook.opera(arr, remove );  //remove

//    System.out.println("START -----");
//    ptBook.displayAll(arr);   //print all books
//    System.out.println("END ----");

    }

    public void Magazines()
    {
        int remove = 4;

        var megarr= new ArrayList<Megazine>();


        String title = "Topic Asus", author= "Maximilian Zeel";
        int npages= 26, volume=3;

        System.out.println(" \n Storage of Magazines: " );
        adMag.add(megarr,title,author,npages,volume);
        adMag.add(megarr, "Cloud Mega", "Van Basteen Lud", 54, 9);

        ptMagazin.displayAll(megarr);
        rmMagazin.remove(megarr, remove);

        //ptMagazin.displayAll(megarr);

        //    public void MagazineNew()
//    {
//      // String StMagazine= (title, author)-> title + author;
//
//    }
    }

    public void Letters(){

    int remove = 0;

    ArrayList <Letter> arrLet = new ArrayList<>();

        String title = "Good bye", author= "Federico Valverde";
        int npages= 5;
        LocalDate date = LocalDate.parse("2022-09-01");

        System.out.println(" \n Storage of Letters: " );
        adLet.add(arrLet,title,author,npages, date );
        adLet.add(arrLet, "Strange", "Kristov Ruud", 3, LocalDate.now());

        ptLet.displayAll(arrLet);
        rmLet.remove(arrLet, remove);
        //ptLet.displayAll(arrLet);

    }

}
