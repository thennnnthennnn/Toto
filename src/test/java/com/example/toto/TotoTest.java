package com.example.toto;

import com.p.Controller.CustomerController;
import com.p.Controller.GoodController;
import com.p.Dao.GoodMapper;
import com.p.Service.CustomerServiceImpl;
import com.p.Service.GoodServiceImpl;
import com.p.TotoApplication;
import com.p.Dao.CustomerMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
@SpringBootTest(classes = TotoApplication.class)
@ComponentScan(basePackages = "com.p.Controller")
class TotoTest {
    @Autowired
    private GoodController goodController;
    @Test
    void test1(){
        System.out.println(goodController.getGoods(2,4));
    }
}