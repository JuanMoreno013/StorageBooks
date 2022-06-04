import java.util.List;

public interface Repository<E> {
    E get(int id);
    List<E> getAll();
    void add(int id, E item);
    void remove(int id);

    void clear();
}
