package com.ccy.springcloud.dao;

import java.util.List;

import com.ccy.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;


/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/4 18:13
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();


}
