import java.util.List;

public class PrintLetter {
    public void displayAll(List<Letter> let)
    {
        for ( Letter letter: let) {
            System.out.println(
                    //"\n Name: " + magazines.getTitle() +
                    (letter.toString() + " \n "));

//            System.out.println();
        }
    }
}
