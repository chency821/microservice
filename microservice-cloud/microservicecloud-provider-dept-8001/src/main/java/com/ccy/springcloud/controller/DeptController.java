package com.ccy.springcloud.controller;

import java.util.List;


import com.ccy.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ccy.springcloud.service.DeptService;

/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/4 18:34
 */
@RestController
public class DeptController {

	@Autowired
    private DeptService deptService;

    @RequestMapping(value = "dept/add",method = RequestMethod.POST)
    public boolean  addDpet(Dept dept){

        return deptService.addDept(dept);
    }

    @RequestMapping(value = "dept/get/{id}",method = RequestMethod.GET)
    public Dept  findById(@PathVariable("id") Long id){
        return deptService.findById(id);
    }

    @RequestMapping(value = "dept/list",method = RequestMethod.GET)
    public List<Dept> findAll(Dept dept){
        return deptService.findAll();
    }
}
