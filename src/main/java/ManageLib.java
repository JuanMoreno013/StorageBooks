import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ManageLib implements OpManagItem<ItemOp>{

//    private final Repository<ItemOp> repository = new HashRepo<>();
    private final Search<ItemOp> search = new Search<>();
    private Repository<ItemOp> repository2;// = new TreeRepo<>();

    /**
     * Select
     */
    public ManageLib(Repositories type) {
        switch (type) {
            case HASH_REPO:
                this.repository2 = new HashRepo<>();
            case TREE_REPO:
                this.repository2 = new TreeRepo<>();
        }
    }

    @Override
    public void remove(int selectIndex) {

        if (repository2.getAll().size() < selectIndex || selectIndex<0) {
            System.out.println(" \n Fail! Your put something wrong, there is not enough items ");
            throw new IndexOutOfBoundsException();
        }else {
            repository2.remove(selectIndex);
        }
    }
    @Override
    public void add(ItemOp objItem) {
        Objects.requireNonNull(objItem);
        repository2.add(objItem.getId(), objItem); //Add the obj to the list
    }

    public List<ItemOp> getAll() {
        return repository2.getAll();
    }

    @Override
    public void removeAll(ItemOp item) {
        if(item != null)
            repository2.clear();
        else
            throw new NullPointerException();
    }

    public void clear() {
        repository2.clear();
    }

    public Optional<ItemOp> get(int id)
    {
        return repository2.get(id);
    }

    public Optional<ItemOp> searchTitle (String title)
    {
       return search.searchName(title, repository2.getAll());
    }


    public int count()
    {
        return search.countElem(repository2.getAll());
//        return repository2.countElements();
    }

    public Optional<ItemOp> searchElement (Object element)
    {
        return search.searchElement(element , repository2.getAll());
    }

    public List<ItemOp> searchAllElements (Object element)
    {
        return search.searchFullElements(element , repository2.getAll());
    }

}

enum Repositories {
    HASH_REPO,
    TREE_REPO
}