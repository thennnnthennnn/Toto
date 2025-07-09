package com.p.Dao;

import com.p.Model.Good;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodMapper {
    Good selectGood(int id);
    boolean insertGood(@Param("price")int price,@Param("name")String name,@Param("inventory")int inventory,@Param("category")String category);
    boolean deleteGood(int id);
    boolean updateGood(@Param("id")int id,@Param("price")int price,@Param("name")String name,@Param("inventory")int inventory,@Param("category")String category);
    int selectCount();
    List<Good> selectRange(@Param("a")int a,@Param("b")int b);

}
