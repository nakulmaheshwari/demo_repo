package com.example.demo.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.dao.OrdersRepository;
import com.example.demo.dao.PaymentRepsoitory;
import com.example.demo.dao.ProductRepository;
import com.example.demo.entities.Orders;
import com.example.demo.entities.Payment;
import com.example.demo.entities.Product;
@Component
public class PaymentService {
    //@Autowired
    //private ProductRepository pr;
    @Autowired
    private PaymentRepsoitory pr;

    public List<Payment> getAllPayment()
    {
        return (List<Payment >)this.pr.findAll();
    }

    public Payment getPaymentById(int id)
    {
        Payment p = this.pr.findById(id);

        return p;
    }
    public Payment addPayment(Payment b)
    {

        return pr.save(b);
    }
    public void deletePayment(int bid)
    {

        pr.deleteById(bid);

    }
    public void updatePayment(Payment p,int pid)
    {
        //p.setPaymentId(pid);
        pr.save(p);
    }


}