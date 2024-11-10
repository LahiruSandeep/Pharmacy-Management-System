package edu.icet.service;

import edu.icet.dto.Orders;

import java.util.List;

public interface OrdersService {
    void addOrder(Orders orders);

    List<Orders> getOrder();

    void deleteById(Integer orderId);

    List<Orders> searchByUserName(String userName);

    List<Orders> searchByContactNumber(String contactNumber);

    List<Orders> searchByAddress(String address);
}
