
package com.example.demo.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.dao.OrdersRepository;
import com.example.demo.dao.ProductRepository;
import com.example.demo.entities.Orders;
import com.example.demo.entities.Product;
@Component
public class OrderService {
    //@Autowired
    //private ProductRepository pr;
    @Autowired
    private OrdersRepository or;

    public List<Orders> getAllOrders()
    {
        return (List<Orders>)this.or.findAll();
    }

    public Orders getProductById(int id)
    {
        Orders o = this.or.findById(id);

        return o;
    }
    public Orders addOrders(Orders b)
    {

        return or.save(b);
    }
    public void deleteOrders(int bid)
    {

        or.deleteById(bid);

    }
    public void updateOrders(Orders p,int pid)
    {
        //p.setOrdersId(pid);
        or.save(p);
    }
	   
	/*public Product add(int pid,int oid)
	{
		Product product = pr.findById(pid);
		
		Orders order = or.findById(oid);
		
		product.addOrder(order);
		
		return pr.save(product);
	}
*/
}