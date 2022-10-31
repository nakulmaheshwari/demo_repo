package com.example.demo.services;


/*
import com.example.demo.dao.OrdersRepository;
import com.example.demo.dao.ProductRepository;
import com.example.demo.entities.Orders;
import com.example.demo.entities.Product;
import com.example.demo.exception.ResourceNotFoundException;
import org.junit.Before;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.mockito.InjectMocks;
        import org.mockito.Mock;
        import org.mockito.Mockito;
        import org.mockito.MockitoAnnotations;
        import org.mockito.junit.MockitoJUnitRunner;
        import org.springframework.test.web.servlet.MockMvc;
        import org.springframework.test.web.servlet.setup.MockMvcBuilders;

        import java.time.LocalDate;
        import java.time.Month;
        import java.util.Arrays;
        import java.util.Optional;

        import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
        import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
        import static org.junit.jupiter.api.Assertions.assertEquals;
        import static org.mockito.ArgumentMatchers.anyLong;
        import static org.mockito.Mockito.*;

//@RunWith(MockitoJUnitRunner.class)
public class ProductTest {

    private MockMvc mockMvc;

    Product s1=new Product(1,"a",1,null);
    Product s2=new Product(2,"aa",2,null);
    Product s3=new Product(3,"aaa",3,null);

    Orders o1=new Orders(1,null);
    @Mock
    private ProductRepository pr;
    @Mock
    private OrdersRepository or;

    @InjectMocks
    private ProductService ps;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(ps).build();
    }

    @Test
    public void getAllSubject(){
        when(pr.findAll()).thenReturn(Arrays.asList(s1,s2,s3));
        System.out.println(ps.getAllProducts());
        assertThat(ps.getAllProducts().size()).isNotNull();
    }


    @Test
    public void getSubjectByid() throws ResourceNotFoundException {
        long id = 1;
      //  when(pr.findById(s1.getProductId())).thenReturn(Optional.ofNullable(s1));
        assertThat(ps.getProductById(s1.getProductId()).getName()).isEqualTo("a");
    }

    @Test
    public void saveProduct() throws Exception{
        Product record=new Product(1,"a",1);
        when(pr.save(record)).thenReturn(record);
        assertThat(ps.addProduct(record).getProductId()).isEqualTo(1);
    }

    @Test
    public void deleteProduct() throws ResourceNotFoundException {
        ps.deleteProduct(any());
        verify(pr,times(1)).deleteById(any());
    }

    @Test
    public void assignOrders() throws ResourceNotFoundException {
        when(pr.findById(any())).thenReturn(Optional.ofNullable(s1));
        when(or.findById(any())).thenReturn(Optional.ofNullable(o1));
        when(pr.save(any(Product.class))).thenReturn(s1);

        assertThat(ps.add(1,1)).isNotNull().isEqualTo(s1);
        //verify(ps, times(1)).save(any(Product.class));

    }

}

 */