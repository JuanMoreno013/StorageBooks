import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashRepo <E> implements Repository<E>{
                    //id
    private final Map< Integer, E> mapRepo = new HashMap<>();


    @Override
    public E get(int id) {
        return mapRepo.get(id);
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
