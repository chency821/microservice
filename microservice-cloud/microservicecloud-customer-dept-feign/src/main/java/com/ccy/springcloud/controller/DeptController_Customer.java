package com.ccy.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ccy.springcloud.entity.Dept;
import com.ccy.springcloud.service.DeptClientService;

/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/5 11:40
 */
@RestController
public class DeptController_Customer {

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "customer/dept/add")
    public boolean  addDept(Dept dept){
        return deptClientService.addDept(dept);
    }

    @RequestMapping(value = "customer/dept/get/{id}")
    public Dept  findById(@PathVariable("id") Long id){
      
        return deptClientService.findById(id);
    }

    @RequestMapping(value = "customer/dept/list")
    public List<Dept> findAll(){
        return deptClientService.findAll();
    }


}
