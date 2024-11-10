package edu.icet.service.impl;

import edu.icet.dto.Orders;
import edu.icet.entity.OrdersEntity;
import edu.icet.repository.OrdersRepository;
import edu.icet.service.OrdersService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrdersServiceImpl implements OrdersService {

    final OrdersRepository repository;
    final ModelMapper mapper;

    @Override
    public void addOrder(Orders orders) {
        repository.save(mapper.map(orders, OrdersEntity.class));
    }

    @Override
    public List<Orders> getOrder() {
        List<Orders> ordersList = new ArrayList<>();
        repository.findAll().forEach(orders -> ordersList.add(mapper.map(orders, Orders.class)));
        return ordersList;
    }

    @Override
    public void deleteById(Integer orderId) {
        repository.deleteById(orderId);
    }

    @Override
    public List<Orders> searchByUserName(String userName) {
        List<Orders> ordersList = new ArrayList<>();
        repository.findByUserName(userName).forEach(entity -> ordersList.add(mapper.map(entity, Orders.class)));
        return ordersList;
    }


    @Override
    public List<Orders> searchByContactNumber(String contactNumber) {
        List<Orders> ordersList = new ArrayList<>();
        repository.findByContactNumber(contactNumber).forEach(entity -> ordersList.add(mapper.map(entity, Orders.class)));
        return ordersList;
    }

    @Override
    public List<Orders> searchByAddress(String address) {
        List<Orders> ordersList = new ArrayList<>();
        repository.findByAddress(address).forEach(entity -> ordersList.add(mapper.map(entity, Orders.class)));
        return ordersList;
    }
}
