package com.p.Dao;

import com.p.Model.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CustomerMapper {
    boolean insertCustomer(@Param("name") String name,@Param("password") String password);
    boolean updateCustomer(@Param("id") int id,@Param("name") String name,@Param("password") String password);
    boolean deleteCustomer(int id);
    Customer selectCustomerById(int id);
    Customer selectCustomerByName(String name);
    Customer selectCustomerByNamePassword(@Param("name") String name,@Param("password") String password);

}
