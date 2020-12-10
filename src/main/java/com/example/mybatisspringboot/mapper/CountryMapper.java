package com.example.mybatisspringboot.mapper;

import java.util.List;

import com.example.mybatisspringboot.model.Country;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CountryMapper {
	/**
	 * 查询全部数据
	 * 
	 * @return
	 */
	List<Country> selectAll();
}
