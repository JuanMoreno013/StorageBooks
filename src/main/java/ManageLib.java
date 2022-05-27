import java.util.ArrayList;
import java.util.Objects;

public class ManageLib implements OpManagItem<ItemOp>{

     ArrayList<ItemOp> itemsLib = new ArrayList<>();

    @Override

    public void remove(int selectIndex) {

        if (itemsLib.size() < selectIndex || selectIndex<0) {
            System.out.println(" \n Fail! Your put something wrong, there is not enough items ");
            throw new IndexOutOfBoundsException();
        }else {
            itemsLib.remove(selectIndex);
        }
    }
    @Override
    public void add(ItemOp objItem) {
        Objects.requireNonNull(objItem);
        itemsLib.add(objItem); //Add the obj to the list
    }

    @Override
    public void RemoveSingle(ItemOp objItem) {
        if (objItem != null )
        {
            for ( ItemOp item: itemsLib) {
                if (item.getClass() == objItem.getClass()) {
                    itemsLib.remove(objItem);
                    break;
                }
            }
        } else {
            throw new NullPointerException(" The item are null ");
        }


    }

    @Override
    public void removeAll(ItemOp item) {
        if(item != null)
            itemsLib.clear();
        else
            throw new NullPointerException();
    }

}
