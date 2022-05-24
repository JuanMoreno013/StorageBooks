import java.util.ArrayList;

public interface OpManagItem<T> {
     void remove(T item, int selectIndex) throws Exception;

     void add(ItemOp item);
}


