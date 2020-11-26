package guru.springframework.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

    protected Map<T, ID> map = new HashMap<>();

    public Set<T> findAll(){
        return new HashSet(map.values());
    }

    public T findById(ID id) {
        return (T) map.get(id);
    }

    public T save(ID id, T object){
        map.put(object, id);
        return object;
    }

    public void deleteById(ID id) {
        map.remove(id);
    }

    public void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }


}

