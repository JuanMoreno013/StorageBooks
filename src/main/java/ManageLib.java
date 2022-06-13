import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

public class ManageLib<K> implements OpManagItem<K>{

//    private final Repository<ItemOp> repository = new HashRepo<>();
    private final Search<ItemOp> search = new Search<>();
    private final Repository<K, ItemOp> repository2;// = config repo use

    Function<ItemOp, ? extends Comparable<K>> keyFunction;

    /**
     * Select
     */
//    public ManageLib(Repositories type,  Function<ItemOp, ? extends Comparable<K>> key ) {
//        switch (type) {
//            case HASH_REPO:
//                this.repository2 = new HashRepo<>();
//                this.keyFunction = key;
//            case TREE_REPO:
//                this.repository2 = new TreeRepo<>();
//                this.keyFunction = key;
//        }
//    }

    public ManageLib(Repository<K, ItemOp> repository, Function<ItemOp, ? extends Comparable<K>> key) {

            if (key==null)
                throw new NullPointerException();

            this.repository2 = repository;
            this.keyFunction = key;

    }

    @Override
    public void remove(Comparable<K> key) {
        if (key==null)
            throw new NullPointerException();

        repository2.remove(key);
    }

    @Override
    public void add(ItemOp objItem) {
        Objects.requireNonNull(objItem);
        repository2.add(keyFunction.apply(objItem), objItem);
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

    public Optional<ItemOp> get(Comparable<K> key)
    {
        return repository2.get(key);
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


//enum Repositories
//{
//    HASH_REPO,
//    TREE_REPO
//}