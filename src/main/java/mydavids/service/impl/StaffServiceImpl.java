package mydavids.service.impl;


import mydavids.domain.Staff;
import mydavids.repository.StaffRepository;
import mydavids.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Yusiry on 5/12/2016.
 */
@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    StaffRepository repository;
    
    @Override
    public Staff Create(Staff entity) {
        return repository.save(entity);
    }


    @Override
    public Staff readById(Integer Id) {
        return repository.findById(Id);
    }

    @Override
    public List<Staff> readAll() {
        List<Staff> staffList = null;
        Iterable<Staff> staff = repository.findAll();
        for(Staff staffMembers : staff){
            staffList.add(staffMembers);
        }
        
        return staffList;
    }

    @Override
    public Staff Update(Staff entity) {
        return repository.save(entity);
    }

    @Override
    public void Delete(Staff entity) {
        repository.delete(entity);
    }
}
