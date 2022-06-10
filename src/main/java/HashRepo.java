import java.util.*;

public class HashRepo <E> implements Repository<E>{
                    //id
    private final Map< Integer, E> mapRepo = new HashMap<>();


    @Override
    public Optional<E> get(int id) {
        return Optional.ofNullable(mapRepo.get(id));
    }

    @Override
    public List<E> getAll() {
        return new ArrayList<>(mapRepo.values());
    }

    @Override
    public void add(int id, E item) {
        mapRepo.put(id,item);
    }

    @Override
    public void remove(int id) {
        mapRepo.remove(id);
    }
    @Override
    public void clear() {
        mapRepo.clear();
    }

}
