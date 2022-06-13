import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;

public class Main {


    public static void main(String[] args) {

        ///// BOOK /////
        LocalDate date = LocalDate.parse("2022-01-01");

         Book b1 = new Book("Preparing bool B1",
                "Nikki Lauda",
                358,
                date,
                "Terror",
                "980-92-09",
                "Princeton",
                "New");

        Book b2 = new Book("Machine Learning B2",
                "Greg Timothy",
                956,
                LocalDate.parse("2001-03-12"),
                "Technology",
                "980-92-23",
                "Princeton",
                "New");


        /////// MAGAZINES///

        Magazine mg1 = new Magazine( "Machine Learning M1",
                "Van Basteen Luud",
                16,
                LocalDate.now(),
                "Information",
                9,
                "Top Science");

        Magazine mg2 = new Magazine( "Top Master Chest M2",
                "Antonio Rudger",
                3,
                LocalDate.parse("2001-04-12"),
                "New Style ",
                2,
                "Adventure SA");

        /////// LETTER///

        var lt1 = new Letter( "Good bye L1",
                "Fredrick Valverde",
                3,
                LocalDate.parse("2022-01-01"),
                "Important",
                "Guadalajara, Jal");

        var lt2 = new Letter( "Good bye L2",
                "Wuelerti Moon",
                5,
                LocalDate.parse("2022-05-01"),
                "History",
                "Luxembourg");

        ////////

        // Put the type of the key to compare

        Function<ItemOp, ? extends Comparable<String>> key = ItemOp::getTitle;


        ManageLib<String> mngLib = new ManageLib<>(new HashRepo<>(), key);

        var print = new PrintLib<>();

        System.out.println(" All items ");

        mngLib.add(b1);
        mngLib.add(mg2);
        mngLib.add(lt1);
        mngLib.add(b2);
        mngLib.add(mg1);

        mngLib.add(lt2);

        print.displayAll(mngLib.getAll());



        mngLib.searchTitle("Machine Learning B2")
                .ifPresentOrElse(
                        print::printSearch,
                        () -> System.out.println("Not Found! ")
                );

        System.out.println("\n Show the number the elements that exists: ");
        print.printCountElements(mngLib.count());

        System.out.println("\n Show the first element with that value: ");
        mngLib.searchElement(LocalDate.now())
                .ifPresentOrElse(
                print::printSearch,
                () -> System.out.println("Not Found! ")
        );

//        System.out.println("\n Show all the items with that value: ");
//         print.displayAll(mngLib.searchAllElements("Machine Learning B2"));  //Display all the elements with that value
//
//        System.out.println( "There is : " + mngLib.count() + "");
        System.out.println(" Remove some items");
        System.out.println(" Only 5 items");
//
        mngLib.remove("Machine Learning B2");
//
        print.displayAll(mngLib.getAll());
//
        System.out.println(" \n Only Books ");
        print.DisplaySingle(mngLib.getAll(), b1);
//
        System.out.println(" \n Only letters ");
        print.DisplaySingle(mngLib.getAll(), lt1);
//
        System.out.println(" Only Magazines");
        print.DisplaySingle(mngLib.getAll(), mg2);
//
        System.out.println(" \n Items ");
        print.displayAll(mngLib.getAll());

        mngLib.removeAll(b1); //Remove all items

        System.out.println(" \n Items after to delete ");
        print.displayAll(mngLib.getAll());

    }

}
