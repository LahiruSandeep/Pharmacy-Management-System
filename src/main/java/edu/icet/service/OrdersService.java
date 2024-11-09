package edu.icet.service;

import edu.icet.dto.Orders;

import java.util.List;

public interface OrdersService {
    void addOrder(Orders orders);

    List<Orders> getOrder();
}
