package mydavids.factory;

import mydavids.domain.Table;

/**
 * Created by Yusiry Davids on 4/17/2016.
 */
public interface TableFactory {
    public Table createTable(int tableNumber, int seating, String location);

}
