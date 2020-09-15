package com.graduation.product;

import com.graduation.product.services.IProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestP {
    @Autowired
    private IProductService iProductService;
    @Test
    public void tests() {
        System.out.println(iProductService.getAllProduct(1,2));
    }
}
