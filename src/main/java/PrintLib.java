import java.util.List;
import java.util.Objects;

public class PrintLib<T> {

    public void displayAll(List<ItemOp> objtItem)
    {
        for ( ItemOp items: objtItem) {
            System.out.println(
                    //"\n Name: " + magazines.getTitle() +
                    (items.toString() + " \n "));
//            System.out.println();
        }
    }

      public void DisplaySingle(List<ItemOp> objtItem, T obj) {

            for ( ItemOp item: objtItem) {
                if (item.getClass() == obj.getClass()) {
                    //objtItem.remove(obj);
                    System.out.println(
                            //"\n Name: " + magazines.getTitle() +
                            (item.toString() + " \n "));
                }
//            System.out.println();
            }
//        }

    }
}
