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

        Book b2 = new Book("Machine Learning",
                "Greg Timothy",
                956,
                LocalDate.parse("2001-03-12"),
                "Terror",
                "980-92-23",
                "Princeton",
                "New");


        /////// MAGAZINES///

        Magazine mg1 = new Magazine( "Cloud Mega",
                "Van Basteen Luud",
                16,
                LocalDate.now(),
                "Informatic ",
                9,
                "Top Science");

        Magazine mg2 = new Magazine( "Top Master Chest",
                "Antonio Rudger",
                34,
                LocalDate.now(),
                "New Style ",
                2,
                "Adventure SA");

        /////// LETTER///

        var lt1 = new Letter( "Good bye",
                "Fedreick Valverde",
                3,
                LocalDate.parse("2022-09-01"),
                "Important",
                "Guadalajara, Jal");

        var lt2 = new Letter( "Rockstar",
                "Wuelerti Moon",
                5,
                LocalDate.parse("2022-09-01"),
                "History",
                "Luxembourg");

        ////

        ManageLib mngLib = new ManageLib();
        var print = new PrintLib();
        //int index= 3;

        System.out.println(" All items ");

        mngLib.add(b1);
        mngLib.add(mg2);
        mngLib.add(b2);
        mngLib.add(mg1);
        mngLib.add(lt1);
        mngLib.add(lt2);
        print.displayAll(mngLib.itemsLib);


        System.out.println(" Remove some items");
        System.out.println(" Only 4 items");

        mngLib.remove(b1,0); //Delete by index
        mngLib.RemoveSingle(mg2);   //Delete object select

        print.displayAll(mngLib.itemsLib);



//        System.out.println(" Only 4 items");
//
//        print.displayAll(mngLib.itemsLib);

        //mngLib.remove(b1,1);

//        System.out.println(" After to delete ");
//        print.displayAll(mngLib.itemsLib);

        //mngLib.add(lt2);


        System.out.println(" Only Books ");

        print.DisplaySingle(mngLib.itemsLib, b1);

        System.out.println(" Only letters ");

        print.DisplaySingle(mngLib.itemsLib, lt1);

        System.out.println(" Only Magazines");

        print.DisplaySingle(mngLib.itemsLib, mg1);
    }

}
