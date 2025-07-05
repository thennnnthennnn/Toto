package com.example.toto;

import com.p.Service.CustomerServiceImpl;
import com.p.TotoApplication;
import com.p.Dao.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = TotoApplication.class)
class TotoTest {
    @Autowired
    CustomerServiceImpl customerServiceImpl;
    @Autowired
    CustomerMapper customerMapper;
    @org.junit.jupiter.api.Test
    void test(){
        System.out.println(customerServiceImpl.changeAccount("ae","123456",null,null));
    }
}