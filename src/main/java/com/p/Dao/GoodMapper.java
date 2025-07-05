package com.p.Dao;

import com.p.Model.Good;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface GoodMapper {
    Good selectGood(int id);
    boolean insertGood(@Param("price")int price,@Param("name")String name,@Param("inventory")int inventory);
    boolean deleteGood(int id);
    boolean updateGood(@Param("id")int id,@Param("price")int price,@Param("name")String name,@Param("inventory")int inventory);

}
