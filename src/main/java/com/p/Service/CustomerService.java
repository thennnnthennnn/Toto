package com.p.Service;

import com.p.Model.Customer;

public interface CustomerService {
    int register(String name,String password);
    int  login(String name,String password);
    int changeAccount(String name1,String password1,String name2,String password2);
    int closeAccount(String name,String password);
}
