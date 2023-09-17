package com.example.render.controller;;

import com.example.render.Customer;;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {
    private static  final List<Customer> CUSTOMERS = List.of(
            new Customer(1L,"Sola","Ishola", "solat@gmail.com"),
            new Customer(2L, "Tope", "Seun", "tope@gmail.com"),
            new Customer(3L, "Bola","Lase","bola@gmail.com")
    );
    @GetMapping
    public List<Customer> findAllCustomers() {
        return CUSTOMERS;
    }
}
