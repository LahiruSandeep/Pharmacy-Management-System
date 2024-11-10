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

    @DeleteMapping("delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteById(@PathVariable Integer id){
        ordersService.deleteById(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void updateOrder(@RequestBody Orders orders){
        ordersService.addOrder(orders);
    }

    @GetMapping("/search-by-username/{userName}")
    public List<Orders> searchByUsername(@PathVariable String userName){
        return ordersService.searchByUserName(userName);
    }

    @GetMapping("/search-by-contactNumber/{contactNumber}")
    public List<Orders> searchByContactNumber(@PathVariable String contactNumber){
        return ordersService.searchByContactNumber(contactNumber);
    }

    @GetMapping("/search-by-address/{address}")
    public List<Orders> searchByAddress(@PathVariable String address){
        return ordersService.searchByAddress(address);
    }

}
