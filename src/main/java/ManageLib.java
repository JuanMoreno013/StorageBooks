import java.time.LocalDate;
import java.util.ArrayList;

public class ManageLib implements OpManagItem<ItemOp>{

     ArrayList<ItemOp> itemsLib = new ArrayList<>();

    @Override
    public void remove(ItemOp item, int selectIndex) {

        if( item == null || itemsLib.size()==0 )
        {
            try {
                throw new BookException("There are not enough items in the library at present");
            } catch (BookException e) {
                System.out.println("Something went wrong!" + e.getMessage());
            }
        }
        else
        {
            removeLi(selectIndex);
        }
    }

    private void removeLi(int selectIndex) {

        if (itemsLib.size() < selectIndex) {
            try {
                throw new BookException(" \n Fail! Your put something wrong, there is not enough items ");
            } catch (Exception e) {
                System.out.println(e.getMessage() + "");
            }
        }else {
            itemsLib.remove(selectIndex);
        }
    }

    @Override
    public void add(ItemOp objItem) {

        if ( objItem == null || objItem.getTitle().isBlank() || objItem.getAuthor().isBlank() || objItem.getPages()<0 ){
            try {
                throw new BookException(" \n Fail! Your put something wrong, you can not put values null or empty ");
            } catch (BookException e) {
                System.out.println("Something went wrong! " + e.getMessage());
            }
        } else {
            itemsLib.add(objItem); //Add the obj to the list
        }
    }

}
