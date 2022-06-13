import java.util.*;

public class TreeRepo<K,E> implements Repository<K,E>{

    private final Map< Comparable<K>, E> mapTreeRepo = new TreeMap<>();


    @Override
    public Optional<E> get(Comparable<K> key) {
        return Optional.ofNullable(mapTreeRepo.get(key));
    }

    @Override
    public List<E> getAll() {
        return new ArrayList<>(mapTreeRepo.values());
    }

    @Override
    public void add(Comparable<K> key, E item) {
        mapTreeRepo.put(key,item);
    }

    @Override
    public void remove(Comparable<K> key) {
        mapTreeRepo.remove(key);
    }
    @Override
    public void clear() {
        mapTreeRepo.clear();
    }

}
