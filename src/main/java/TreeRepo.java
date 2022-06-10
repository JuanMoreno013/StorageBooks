import java.util.*;

public class TreeRepo<E> implements Repository<E>{

    private final Map< Integer, E> mapTreeRepo = new TreeMap<>();

    @Override
    public Optional<E> get(int id) {
        return Optional.ofNullable(mapTreeRepo.get(id));
    }

    @Override
    public List<E> getAll() {
        return new ArrayList<>(mapTreeRepo.values());
    }

    @Override
    public void add(int id, E item) {
        mapTreeRepo.put(id,item);
    }

    @Override
    public void remove(int id) {
        mapTreeRepo.remove(id);
    }
    @Override
    public void clear() {
        mapTreeRepo.clear();
    }

}
