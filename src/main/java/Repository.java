import java.util.List;
import java.util.Optional;

public interface Repository<K,E> {
    Optional<E> get(Comparable<K> key);
    List<E> getAll();
    void add(Comparable<K> key, E item);  //add comparable <K>
    void remove(Comparable<K> key);
    void clear();

}
