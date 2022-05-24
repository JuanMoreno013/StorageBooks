import java.util.ArrayList;

public interface OpManagItem<T> {
     void remove(ArrayList<T> adb, int selectIndex) throws Exception;

     void add(ArrayList<T> adb);
}


