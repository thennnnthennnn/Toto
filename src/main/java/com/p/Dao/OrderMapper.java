package com.p.Dao;

import com.p.Model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface OrderMapper {
    Order selectOrder(int id);
    boolean insertOrder(@Param("price")int price,@Param("customerId")int customerId);
    boolean deleteOrder(int id);
    boolean updateOrder(@Param("id")int id,@Param("price")int price,@Param("customerId")int customerId);
}
