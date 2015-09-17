package spring.test.mx.dao;

import java.io.Serializable;
import java.util.List;

public interface AbstractGenericDao<T, PK extends Serializable> {

    void create(T newInstance);
    T read(PK id);
    void update(T transientObject);
    void delete(T persistentObject);
    List<T> findAll();
    long count();

}
