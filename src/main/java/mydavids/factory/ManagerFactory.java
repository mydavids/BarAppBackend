package mydavids.factory;

import mydavids.domain.Manager;

/**
 * Created by Yusiry Davids on 4/17/2016.
 */
public interface ManagerFactory {
    Manager createManager(String name, String surname, String idNumber);
}
