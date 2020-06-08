package com.ccy.springcloud.service;


import com.ccy.springcloud.entity.Dept;

import java.util.List;



/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/4 18:28
 */
public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
