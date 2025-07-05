package com.p.Service;

import com.p.Dao.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerMapper customerMapper;

    public int login(String name,String password){
        if (customerMapper.selectCustomerByNamePassword(name, password) != null) {
            return customerMapper.selectCustomerByNamePassword(name,password).getId();
        }else{
            return -1;
        }
    }
    public int register(String name,String password){
        if(customerMapper.selectCustomerByName(name)==null){
            return name!=null&&!name.trim().isEmpty()&&password!=null&&!password.trim().isEmpty()&&customerMapper.insertCustomer(name,password)?1:0;
        }else{
            return -1;
        }
    }
    public int changeAccount(String name1, String password1, String name2, String password2) {
        if(login(name1,password1)==-1){
            return -2;
        }else{
            if(customerMapper.selectCustomerByName(name2)!=null){
                if(name1==name2){
                    return name2!=null&&!name2.trim().isEmpty()&&password2!=null&&!password2.trim().isEmpty()&&customerMapper.updateCustomer(login(name1,password1),name2,password2)?1:0;
                }else{
                    return -1;
                }
            }else{
                return name2!=null&&!name2.trim().isEmpty()&&password2!=null&&!password2.trim().isEmpty()&&customerMapper.updateCustomer(login(name1,password1),name2,password2)?1:0;
            }
        }
    }
    public int closeAccount(String name, String password) {
        if(customerMapper.selectCustomerByNamePassword(name,password)==null){
            return -1;
        }else{
            return customerMapper.deleteCustomer(customerMapper.selectCustomerByNamePassword(name,password).getId())?1:0;
        }
    }
}
