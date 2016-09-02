package mydavids.repository;

import mydavids.domain.Administrator;

import java.util.ArrayList;

/**
 * Created by Yusiry Davids on 4/24/2016.
 */
public interface AdministratorRepository {
    void create(Administrator admin);
    Administrator findById(String id);
    void update(Administrator admin);
    void delete(Administrator admin);
    ArrayList<Administrator> getAll();
}
