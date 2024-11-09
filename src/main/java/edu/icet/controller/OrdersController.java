package edu.icet.controller;

import edu.icet.dto.Orders;
import edu.icet.service.OrdersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/orders")
public class OrdersController {

    final OrdersService ordersService;

    @PostMapping("/add-order")
    @ResponseStatus(HttpStatus.CREATED)
    public void addOrder(@RequestBody Orders orders){
        ordersService.addOrder(orders);
    }

    @GetMapping("/get-all-orders")
    public List<Orders> getOrder() {
        return ordersService.getOrder();
    }
}
