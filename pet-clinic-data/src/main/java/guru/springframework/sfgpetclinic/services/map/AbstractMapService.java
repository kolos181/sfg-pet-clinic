package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    public Set<T> findAll() {
        return new HashSet(map.values());
    }

    public T findById(ID id) {
        return (T) map.get(id);
    }

    public T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextValueId());
                map.put(object.getId(), object);
            }
        } else {
            throw new NoSuchElementException();
        }
        return object;
    }

    public void deleteById(ID id) {
        map.remove(id);
    }

    public void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    public Long getNextValueId() {
        Long nextIdValue = null;
        try {
            nextIdValue = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextIdValue = 1L;
        }
        return nextIdValue;
    }

}

