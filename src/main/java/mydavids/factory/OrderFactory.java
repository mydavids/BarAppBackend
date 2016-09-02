package mydavids.factory;

import mydavids.domain.Order;

/**
 * Created by Yusiry Davids on 4/17/2016.
 */
public interface OrderFactory {
    public Order createOrder(String date, double amount);
}
