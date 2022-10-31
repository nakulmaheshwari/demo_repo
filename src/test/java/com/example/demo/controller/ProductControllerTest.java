
package com.example.demo.controller;


/*
        import com.example.demo.controllers.AppController;
        import com.example.demo.entities.Orders;
        import com.example.demo.entities.Product;
        import com.example.demo.services.ProductService;
        import com.fasterxml.jackson.databind.ObjectMapper;
        import com.fasterxml.jackson.databind.ObjectWriter;
        import org.junit.Before;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.mockito.InjectMocks;
        import org.mockito.Mock;
        import org.mockito.Mockito;
        import org.mockito.MockitoAnnotations;
        import org.mockito.junit.MockitoJUnitRunner;
        import org.springframework.http.MediaType;
        import org.springframework.test.web.servlet.MockMvc;
        import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
        import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
        import org.springframework.test.web.servlet.setup.MockMvcBuilders;

        import java.time.LocalDate;
        import java.time.Month;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

        import static org.hamcrest.Matchers.*;
        import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
        import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
        import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@RunWith(MockitoJUnitRunner.class)
public class ProductControllerTest {

    private MockMvc mockMvc;
    ObjectMapper objectMapper = new ObjectMapper();
    ObjectWriter objectWriter = objectMapper.writer();

    @Mock
    private ProductService ps;

    @InjectMocks
    private AppController ac;

    Product s1=new Product(1,"a",1,null);
    Product s2=new Product(2,"aa",2,null);
    Product s3=new Product(3,"aaa",3,null);


    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(ac).build();
    }

    @Test
    public void getAllProducts() throws Exception {
        List<Product> std = new ArrayList<>(Arrays.asList(s1, s2, s3));
        Mockito.when(ps.getAllProducts()).thenReturn(std);
        mockMvc.perform(MockMvcRequestBuilders
                        .get("/Products")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
//                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].name", is("a")));
    }

    @Test
    public void getProductById() throws Exception {
        Mockito.when(ps.getProductById(s1.getProductId())).thenReturn(s1);

        mockMvc.perform(MockMvcRequestBuilders
                        .get("/Product/1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
//                .andExpect(status().isOk())
                .andExpect(jsonPath("$", notNullValue()))
                .andExpect(jsonPath("$.name", is("a")));
    }

    @Test
    public void deleteProduct() throws Exception {


        this.mockMvc.perform(MockMvcRequestBuilders
                        .delete("/Product/{id}", 1)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void addProduct() throws Exception {

//        Mockito.when(teacherService.createTeacherService(t1)).thenReturn(t1);

        mockMvc.perform(MockMvcRequestBuilders
                        .post("/Product")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(new Orders(1, null)))
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").exists());
    }

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void updateProduct() throws Exception {
        Mockito.when(ps.addProduct(s1)).thenReturn(s1);
        String content = objectWriter.writeValueAsString(s1);
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.post("/Product")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(asJsonString(s1));
        mockMvc.perform(mockHttpServletRequestBuilder)
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$", notNullValue()));

    }
}
*/