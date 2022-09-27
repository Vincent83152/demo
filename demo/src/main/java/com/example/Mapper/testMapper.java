package com.example.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.Model.Pojo.user;

@Mapper
public interface testMapper {
    @Select("SELECT * FROM  user")
	public List<user> findAll();

    @Select("select * from user where id = #{value}")
	public List<user> findById(String value);
}
