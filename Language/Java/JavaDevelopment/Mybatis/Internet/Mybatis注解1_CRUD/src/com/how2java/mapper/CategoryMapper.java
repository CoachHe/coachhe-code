package com.how2java.mapper;
 
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.how2java.pojo.Category;
 
public interface CategoryMapper {
 
    @Insert(" insert into category_ ( name ) values (#{name}) ")  
    public int add(Category category);  
       
    @Delete(" delete from category_ where id= #{id} ")  
    public void delete(int id);  
       
    @Select("select * from category_ where id= #{id} ")  
    public Category get(int id);  
     
    @Update("update category_ set name=#{name} where id=#{id} ")  
    public int update(Category category);   
       
    @Select(" select * from category_ ")  
    public List<Category> list();  
}