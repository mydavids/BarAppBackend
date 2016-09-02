package mydavids.service;

import mydavids.domain.Administrator;

import java.util.ArrayList;

/**
 * Created by Yusiry on 6/7/2016.
 */
public interface AdministratorService {
    boolean addAdiminstrator(Administrator administrator);
    ArrayList<Administrator> getAllAdmin();
}
