import org.junit.jupiter.api.Test;
//import org.junit.After;
//import org.junit.Before;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.util.function.Function;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ManageLibTest<K> {

    @Mock
    Function<ItemOp, ? extends Comparable<String>> key ;

    @Mock
    private Repository<String, ItemOp> repository;

    @InjectMocks
    private ManageLib<K> manLib;


//    @Spy
   static Book b1 = new Book("Preparing bool",
            "null",
            358,
            LocalDate.parse("2001-03-12"),
            "Terror",
            "980-92-23",
            "Princeton",
            "New");
//    @Spy
   static  Book b2 = new Book("Machine Learning",
            "Greg Timothy",
            956,
            LocalDate.parse("2001-03-12"),
            "Terror",
            "980-92-23",
            "Princeton",
            "New");
//    @Spy
   static  Magazine mg1 = new Magazine( "Cloud Mega",
            "Van Basteen Luud",
            16,
            LocalDate.now(),
            "Information ",
            9,
            "Top Science");
//    @Spy
   static Magazine mg2 = new Magazine( "Top Master Chest",
            "Antonio Rudger",
            34,
            LocalDate.now(),
            "New Style ",
            2,
            "Adventure SA");

    @BeforeEach
    @DisplayName("Initialize Objects to test")
    public void initItems(){

        manLib.add(b1);
        manLib.add(b2);
        manLib.add(mg2);
        manLib.add(mg1);

    }


    @Test
    @DisplayName("Constructor Manage Lib, throws exception ,when the key are null  ")
    void constructorMangeLib() {
        assertThrows(NullPointerException.class, () -> new ManageLib<>(new TreeRepo<>(),null));
    }

    @Test
    @DisplayName("Show item, show teh totally count of items ,when already exist elements ")
    void count() {

        List<ItemOp> list = List.of(b1, b2, mg1, mg2);
        Mockito.when(repository.getAll()).thenReturn(list);

        assertEquals(list.size(), manLib.count() );

    }
        ///////REMOVE ////

    @Test
    @DisplayName("Remove item, throws exception ,when the key are null  ")
    void remove() {

        assertThrows(NullPointerException.class, () -> manLib.remove(null));
    }


    @Test
    @DisplayName("Remove item 2,Remove item from list ,when pass the item ")
    void remove2() {
        List<ItemOp> list = new java.util.ArrayList<>(List.of(b1, b2, mg1, mg2));
        Mockito.when(repository.getAll()).thenReturn(list);
        System.out.println("First count " + manLib.count());
        manLib.removeI(b1);
        list.remove(b1);
        System.out.println("Last count " + manLib.count());

        assertEquals(3,manLib.count());

    }

    @DisplayName("Remove Item, does not throws exception, when the item is not null using parameterized")
    @ParameterizedTest
    @MethodSource("multipleObjectsToRemove")
    void remove3(ItemOp i) {
        assertDoesNotThrow(() -> manLib.removeI(i));
    }

    static Stream<Arguments>  multipleObjectsToRemove()
    {
        return Stream.of(b1, b2, mg1, mg2).map(Arguments::arguments);
    }

    @Test
    @DisplayName(" Remove All items , Remove all the items from the list, when the list are not null")
    void removeAll() {
        Mockito.when(repository.getAll()).thenReturn(List.of());
        manLib.removeAll(mg1);
        assertEquals(0, manLib.getAll().size());
    }


    @Test
    @DisplayName(" Remove All items 2, throw exception, when the item are null")
    void removeAll2() {
        assertThrows(NullPointerException.class, () -> manLib.removeAll(null));
    }

     //////// ADD ////////

    @DisplayName("Add Item, does not throws an exception, when add multiple item to the list")
    @ParameterizedTest
    @MethodSource("multiplyObjectsToGetAdd")
    void add(ItemOp i) {
        assertDoesNotThrow(() -> manLib.add(i));
    }

    static Stream<Arguments>  multiplyObjectsToGetAdd()
    {
        return Stream.of(b1, b2, mg1, mg2).map(Arguments::arguments);
    }


    @DisplayName("Add Item, check the final size of the list , when we add multiple items using parameterized")
    @ParameterizedTest
    @MethodSource("multiplyObjectsToGetAdd")
    void add2(ItemOp i) {
        List<ItemOp> list = new ArrayList<>(List.of(b1, b2));
        Mockito.when(repository.getAll()).thenReturn(list);
        int initialSize = manLib.count();
        manLib.add(i);
        list.add(i);
        int finalSize = manLib.count();
        assertEquals(1, finalSize - initialSize);

    }

    @DisplayName("Add Item, throws an exception, when the item is multiple null")
    @ParameterizedTest
    @MethodSource("multiplyObjectsToGetAddNulls")
    void add3(ItemOp i) {
        assertThrows(NullPointerException.class, () -> manLib.add(i));
    }

    static Stream<Arguments>  multiplyObjectsToGetAddNulls()
    {
        return Stream.of(null, null, null, null).map(Arguments::arguments);
    }

    @AfterEach
    public void destroyItems() {
        manLib.clear();
        manLib=null;
    }

}