import java.util.List;

public class PrintMagazines {

    public void displayAll(List<Megazine> mgzins)
    {
        for ( Megazine magazines: mgzins) {
            System.out.println(
                    //"\n Name: " + magazines.getTitle() +
                (magazines.toString() + " \n "));

//            System.out.println();
        }
    }
}
