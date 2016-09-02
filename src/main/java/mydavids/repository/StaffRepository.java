package mydavids.repository;


import mydavids.domain.Staff;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by Yusiry Davids on 4/24/2016.
 */
@Repository
public interface StaffRepository extends CrudRepository<Staff, Integer> {
    public Staff findById(int id);
}
