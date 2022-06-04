import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ManageLib implements OpManagItem<ItemOp>{

    private final Repository<ItemOp> repository = new HashRepo<>();
//     ArrayList<ItemOp> itemsLib = new ArrayList<>();

    @Override

    public void remove(int selectIndex) {

        if (repository.getAll().size() < selectIndex || selectIndex<0) {
            System.out.println(" \n Fail! Your put something wrong, there is not enough items ");
            throw new IndexOutOfBoundsException();
        }else {
            repository.remove(selectIndex);
        }
    }
    @Override
    public void add(ItemOp objItem) {
        Objects.requireNonNull(objItem);
        repository.add(objItem.getId(), objItem); //Add the obj to the list
    }

    public List<ItemOp> getAll() {
        return repository.getAll();
    }

//    @Override
//    public void RemoveSingle(ItemOp objItem) {
//        if (objItem != null )
//        {
//            for ( ItemOp item: repository.getAll()) {
//                if (item.getClass() == objItem.getClass()) {
//                    repository.
//                    repository.remove();
//                    break;
//                }
//            }
//
//        } else {
//            throw new NullPointerException(" The item are null ");
//        }
//
//    }

    @Override
    public void removeAll(ItemOp item) {
        if(item != null)
            repository.clear();
        else
            throw new NullPointerException();
    }

    public void clear() {
        repository.clear();
    }

    public void get()
    {

    }

}
