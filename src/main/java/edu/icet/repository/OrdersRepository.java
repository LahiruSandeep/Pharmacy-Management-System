package edu.icet.repository;

import edu.icet.entity.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdersRepository extends JpaRepository<OrdersEntity, Integer> {
    List<OrdersEntity> findByUserName(String userName);
    List<OrdersEntity> findByContactNumber(String contactNumber);
    List<OrdersEntity> findByAddress(String address);
}
