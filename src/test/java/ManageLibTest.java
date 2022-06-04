import org.junit.jupiter.api.Test;
//import org.junit.After;
//import org.junit.Before;
import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ManageLibTest {
    private ManageLib manLib = new ManageLib();

//    ArrayList<ItemOp> itemsLib = new ArrayList<>();

    Book b1 = new Book("Preparing bool",
            "null",
            358,
            LocalDate.parse("2001-03-12"),
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

    @BeforeEach
    @DisplayName("Initialize Objects to test")
    public void initItems(){
//        System.out.println("Before");
        manLib = new ManageLib();

        manLib.add(b1);
        manLib.add(b2);
        manLib.add(mg2);
        manLib.add(mg1);
    }

        ///////REMOVE ////
    @Test
    @DisplayName("Remove item, throws exception ,when index is less than 0  ")
    void remove() {
//        System.out.println("Size " + manLib.itemsLib.size());
        assertThrows(IndexOutOfBoundsException.class, () -> manLib.remove( -1));
    }
    @Test
    @DisplayName("Remove item 2,Remove item from list ,when index are in the range of the size ")
    void remove2() {
//        System.out.println(manLib.itemsLib.size());
            manLib.remove(2);
    }
    @Test
    @DisplayName("Remove item 3, throws exception ,when index is greater than the range of the size  ")
    void remove3() {
        assertThrows(IndexOutOfBoundsException.class, () -> manLib.remove(8));
    }

    @Test
    @DisplayName(" Remove All items , Remove all the items from the list, when the list are not null")
    void removeAll() {
        manLib.removeAll(mg1);
        assertEquals(0, manLib.getAll().size());
    }
    @Test
    @DisplayName(" Remove All items 2, throw exception, when the item are null")
    void removeAll2() {
        assertThrows(NullPointerException.class, () -> manLib.removeAll(null));
    }

     //////// ADD ////////
    @Test
    @DisplayName("Add Item, add item to the list, when the item are not null")
    void add() {
        assertDoesNotThrow(() -> manLib.add(b1));
    }
    @Test
    @DisplayName("Add Item, throw exception, when the item are null")
    void add2() {
        assertThrows(NullPointerException.class, () -> manLib.add(null));
    }
    @AfterEach
    public void destroyItems() {
        manLib.clear();
        manLib=null;
    }

}