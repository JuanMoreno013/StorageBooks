import java.time.LocalDate;
import java.util.Comparator;
import java.util.Optional;
import java.util.TreeMap;

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

        Magazine mg1 = new Magazine( "Machine Learning B2",
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

        ManageLib mngLib = new ManageLib(Repositories.TREE_REPO);
        var print = new PrintLib<>();

        System.out.println(" All items ");

        mngLib.add(b1);
        mngLib.add(mg2);
        mngLib.add(lt1);
        mngLib.add(b2);
        mngLib.add(mg1);

        mngLib.add(lt2);

//        print.displayAll(mngLib.getAll());

//         mngLib.searchTitle("Good bye L1"); //SearchByTitle
//        mngLib.searchTitle("Good bye L1").ifPresent(print::printSearch);

        mngLib.searchTitle("Machine Learning B2")
                .ifPresentOrElse(
                        print::printSearch,
                        () -> System.out.println("Not Found! ")
                );

        Comparator<Object> comparator = (obj1, obj2) -> ((String) obj1).compareTo(((String) obj2));
        new TreeMap<>(comparator);

        System.out.println("\n Show the number the elements that exists: ");
        print.printCountElements(mngLib.count());

        System.out.println("\n Show the first element with that value: ");
        mngLib.searchElement(LocalDate.now())
                .ifPresentOrElse(
                print::printSearch,
                () -> System.out.println("Not Found! ")
        );

        System.out.println("\n Show all the items with that value: ");
         print.displayAll(mngLib.searchAllElements("Machine Learning B2"));  //Display all the elements with that value

//        System.out.println( "There is : " + mngLib.count() + "");
//        System.out.println(" Remove some items");
//        System.out.println(" Only 4 items");
//
//        mngLib.remove(0); //Delete by index from all items
//
//        print.displayAll(mngLib.getAll());
//
//        System.out.println(" Only Books ");
//        print.DisplaySingle(mngLib.getAll(), b1);
//
//        System.out.println(" Only letters ");
//        print.DisplaySingle(mngLib.getAll(), lt1);
//
//        System.out.println(" Only Magazines");
//        print.DisplaySingle(mngLib.getAll(), mg2);
//
//        System.out.println(" Items ");
//        print.displayAll(mngLib.getAll());
//
//        mngLib.removeAll(b1); //Remove all items
//
//        System.out.println(" Items after to delete ");
//        print.displayAll(mngLib.getAll());
//
//
//        Optional<ItemOp> item = mngLib.get(mg1.getId());
//        if (item.isPresent())
//            System.out.println("Found: \n" + item.get());
//        else
//            System.out.println("No ta");
    }

}
