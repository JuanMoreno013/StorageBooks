import java.util.List;

public class PrintLib<T> {

    public void displayAll(List<ItemOp> objtItem)
    {
        if( objtItem == null || objtItem.size()==0 )
        {
            try {
                throw new BookException("There are no items in the library at present");
            } catch (BookException e) {
                System.out.println("Something went wrong!" + e.getMessage());
            }
        } else {
            for ( ItemOp items: objtItem) {
                System.out.println(
                        (items.toString() + " \n "));
            }
        }
    }

      public void DisplaySingle(List<ItemOp> objtItem, T obj) {

          if( objtItem == null || objtItem.size()==0 )
          {
              try {
                  throw new BookException("There are no items in the library at present");
              } catch (BookException e) {
                  System.out.println("Something went wrong!" + e.getMessage());
              }
          } else {
              for ( ItemOp item: objtItem) {
                  if (item.getClass() == obj.getClass()) {
                      System.out.println(
                              (item.toString() + " \n "));
                  }
              }
          }

    }

}