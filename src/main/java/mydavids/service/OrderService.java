package mydavids.service;

import mydavids.domain.Order;
import mydavids.domain.Stock;

import java.util.ArrayList;

/**
 * Created by Yusiry on 5/12/2016.
 */
public interface OrderService extends Services<Order, Long> {


    double calculateTotal(Order order);

    boolean addItemToOrder(Stock stock, Order order);
}
