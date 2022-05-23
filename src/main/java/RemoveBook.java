import java.util.ArrayList;

public class RemoveBook implements ItemOpe{

//    AddBook adb = new AddBook();


    @Override
    public void add(ArrayList<Book> arr) {

    }

    @Override
    public void opera(ArrayList<Book> adb, int selectIndex) {

        if( adb == null || adb.size()==0 )
        {
            try {
                throw new BookException("There are no books in the library at present");
            } catch (BookException e) {
                System.out.println("Something went wrong!" + e.getMessage());
            }
        }
        else
        {
                    remove(adb, selectIndex);
        }
    }

    public void remove(ArrayList<Book> adb, int selectIndex){

        try {
            adb.remove(selectIndex);

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + "");
        }


    }

}
