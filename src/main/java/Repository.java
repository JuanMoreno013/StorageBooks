import java.util.List;
import java.util.Optional;

public interface Repository<E> {
    Optional<E> get(int id);
    List<E> getAll();
    void add(int id, E item);
    void remove(int id);
    void clear();

}
