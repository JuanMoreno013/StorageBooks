import java.util.List;

public class PrintLib<T> {

    public void displayAll(List<ItemOp> objtItem)  //Print all the elements in the list
    {
            for ( ItemOp items: objtItem) {
                System.out.println(
                        (items.toString() ));
            }
    }
      public void DisplaySingle(List<ItemOp> objtItem, T obj) {  //Print for Category
              for ( ItemOp item: objtItem) {
                  if (item.getClass() == obj.getClass()) {
                      System.out.println(
                              (item + " \n "));
                  }
              }
      }

      public void printSearch(ItemOp item)   //print the first element that it search
      {
              System.out.println("\n Found! " + item + "\n");
      }

      public void printCountElements(int cElements)
      {
          System.out.println( " \n There is : " + cElements + " elements");
      }
}