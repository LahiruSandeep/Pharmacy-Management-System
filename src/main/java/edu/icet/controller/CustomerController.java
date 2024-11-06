package edu.icet.controller;

import edu.icet.dto.Customer;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {

    final CustomerService customerService;

    @PostMapping("/add-customer")
    @ResponseStatus(HttpStatus.CREATED)
    public void addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
    }

    @GetMapping("/get-all-customer")
    public List<Customer> getCustomer() {
        return customerService.getCustomer();
    }

    @DeleteMapping("delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteById(@PathVariable Integer id){
        customerService.deleteById(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void updateCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
    }

    @GetMapping("/search-by-name/{name}")
    public List<Customer> searchByName(@PathVariable String name){
        return customerService.searchByName(name);
    }

    @GetMapping("/search-by-contactNumber/{contactNumber}")
    public List<Customer> searchByContactNumber(@PathVariable String contactNumber){
        return customerService.searchByContactNumber(contactNumber);
    }

    @GetMapping("/search-by-address/{address}")
    public List<Customer> searchByAddress(@PathVariable String address){
        return customerService.searchByAddress(address);
    }
}
