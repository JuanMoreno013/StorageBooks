import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {

        ///// BOOK /////
        LocalDate date = LocalDate.parse("2022-09-01");

         Book b1 = new Book("Preparing bool",
                "Nikki Lauda",
                358,
                date,
                "Terror",
                "980-92-23",
                "Princeton",
                "New");

        //Book 2
//        String title2 = "Solid ", author2= "Kristal Karl", subject2= " Drama ", id2= "938-9-11",  status2= "New";
//        int npages2= 128;


        /////// MAGAZINES///

        Magazine mg1 = new Magazine( "Cloud Mega",
                "Van Basteen Luud",
                16,
                LocalDate.now(),
                "Informatic ",
                9,
                "Top Science");


        /////// LETTER///

        var lt1 = new Letter( "Good bye",
                "Fedreick Valverde",
                3,
                LocalDate.parse("2022-09-01"),
                "Important",
                "Guadalajara, Jal");

        ////

        ManageLib mngLib = new ManageLib();
        var print = new PrintLib();
        int index= 3;

        mngLib.add(b1);
        mngLib.remove(b1,index);

        mngLib.add(mg1);
        print.displayAll(mngLib.itemsLib);

        System.out.println(" Only 2 items");

        mngLib.add(lt1);
        print.displayAll(mngLib.itemsLib);

        mngLib.remove(b1,1);

        System.out.println(" After to delete ");
        print.displayAll(mngLib.itemsLib);

        //print.DisplaySingle(mngLib.itemsLib, mg1);

    }

}
