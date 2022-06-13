import java.util.*;

public class HashRepo <K,E> implements Repository<K,E>{
    private final Map< Comparable<K>, E> mapRepo = new HashMap<>();


    @Override
    public Optional<E> get(Comparable<K> key) {
        return Optional.ofNullable(mapRepo.get(key));
    }

    @Override
    public List<E> getAll() {
        return new ArrayList<>(mapRepo.values());
    }

    @Override
    public void add( Comparable<K> key, E item) {
        mapRepo.put(key, item);
    }

    @Override
    public void remove(Comparable<K> key) {
        mapRepo.remove(key);
    }
    @Override
    public void clear() {
        mapRepo.clear();
    }

}
