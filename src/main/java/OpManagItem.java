
public interface OpManagItem<T> {
     void remove(T item, int selectIndex);
     void add(ItemOp item);
     void RemoveSingle(T item);
     void removeAll(T item);

}


