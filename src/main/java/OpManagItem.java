
public interface OpManagItem<T> {
     void remove(T item, int selectIndex) throws Exception;
     void add(ItemOp item);
     void RemoveSingle(T item);

}


