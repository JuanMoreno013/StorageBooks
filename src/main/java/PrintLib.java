import java.util.List;

public class PrintLib<T> {

   // Repository<ItemOp> repository;

    public void displayAll(List<ItemOp> objtItem)
    {
            for ( ItemOp items: objtItem) {
                System.out.println(
                        (items.toString() + " \n "));
            }
    }
      public void DisplaySingle(List<ItemOp> objtItem, T obj) {  //Print for Category
              for ( ItemOp item: objtItem) {
                  if (item.getClass() == obj.getClass()) {
                      System.out.println(
                              (item.toString() + " \n "));
                  }
              }
      }

}