import java.util.*;
import java.util.function.Consumer;

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
        if (item == null)
            throw new NullPointerException();

        mapTreeRepo.put(key,item);
    }

    @Override
    public void remove(Comparable<K> key) {
        if (key ==null)
            throw new NullPointerException();
        mapTreeRepo.remove(key);
    }

    @Override
    public void remove(E item) {
        if (item==null)
            throw new NullPointerException();

       Consumer<Comparable<K>> consumer = mapTreeRepo::remove;
       mapTreeRepo.entrySet()
               .stream()
                .filter(entry -> entry.getValue().equals(item))
                .map(Map.Entry::getKey)
               .findFirst()
               .ifPresentOrElse(consumer, () -> { throw new IllegalArgumentException(); });

    }

    @Override
    public void clear() {
        mapTreeRepo.clear();
    }

}
