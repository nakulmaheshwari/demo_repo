package com.example.demo.dao;

import com.example.demo.entities.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Payment;
@Component
public interface PaymentRepsoitory extends CrudRepository<Payment, Integer>
{
    public Payment findById(int id);
}
