package mydavids.factory;


import mydavids.domain.Staff;

/**
 * Created by Yusiry Davids on 4/17/2016.
 */
public interface WaiterFactory {
    Staff createWaiter(String name, String surname, String idNumber);
}
