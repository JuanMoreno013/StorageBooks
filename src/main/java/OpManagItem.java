
public interface OpManagItem<K> {
     void remove(Comparable<K> key);
     void add(ItemOp item);
//     void RemoveSingle(T item);
     void removeAll(ItemOp item);

     void removeI(ItemOp item);

}


