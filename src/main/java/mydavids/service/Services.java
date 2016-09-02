package mydavids.service;

import mydavids.domain.Staff;

import java.util.List;

/**
 * Created by Yusiry on 8/13/2016.
 */
public interface Services<E, ID> {
    E Create(E entity);

    E readById(ID id);

    List<Staff> readAll();

    E Update(E entity);

    void Delete(E entity);

}
