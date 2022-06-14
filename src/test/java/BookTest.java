import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    Book b1 = new Book("Preparing bool",
            "Nikki Lauda",
            358,
            LocalDate.now(),
            "Terror",
            "980-92-23",
            "Princeton",
            "New");

    @Test
    @DisplayName("Book 1, create a book, when all the characteristics are correct")
    void Book1() {
        new Book("Rush", "Crist", 3, LocalDate.now(), "Pou", "12-43", "asd", "new");
    }

    @Test
    @DisplayName("Book 2, throw exception, when at least 1 characteristic are wrong")
    void Book2() {
        assertThrows(IllegalArgumentException.class,
                () -> new Book("  ", "asd", 34, LocalDate.now(), "asd", "asd", "qwd", "old")
        );
    }

    @Test
    @DisplayName("All elements are correct")
    void TessAddWithAllElementsAreCorrect(){

        assertAll("Test",
                ()->assertNotNull(b1),
//                ()-> assertNotEquals("",1),
                ()->assertNotEquals(" ", b1.getTitle().isBlank()),
                ()->assertNotEquals(" ", b1.getAuthor().isBlank()));
//                ()->assertEquals(str2, result));
    }

}
