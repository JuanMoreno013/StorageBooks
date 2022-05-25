import java.util.ArrayList;

public class ManageLib implements OpManagItem<ItemOp>{

     ArrayList<ItemOp> itemsLib = new ArrayList<>();

    @Override
    public void remove(ItemOp item, int selectIndex) {

        if( item == null || itemsLib.size()==0 )
        {
                System.out.println("There are not enough items in the library at present");
        }
        else
        {
            removeLi(selectIndex);
        }
    }

    private void removeLi(int selectIndex) {

        if (itemsLib.size() < selectIndex) {
                System.out.println(" \n Fail! Your put something wrong, there is not enough items ");
        }else {
            itemsLib.remove(selectIndex);
        }
    }

    @Override
    public void add(ItemOp objItem) {
        itemsLib.add(objItem); //Add the obj to the list
    }

    @Override
    public void RemoveSingle(ItemOp objItem) {
        for ( ItemOp item: itemsLib) {
            if (item.getClass() == objItem.getClass()) {
                itemsLib.remove(objItem);
                break;
            }
        }
    }

}
