package com.ccy.springcloud.service;


import com.ccy.springcloud.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/6 10:36
 */
//@FeignClient(value = "MICROSERVICECLOUD-DEPT")
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
//@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallback = DeptClientServiceFallback.class)
public interface DeptClientService {


    @RequestMapping(value = "dept/add",method = RequestMethod.POST)
    public boolean  addDept(Dept dept);

    @RequestMapping(value = "dept/get/{id}",method = RequestMethod.GET)
    public Dept  findById(@PathVariable("id") Long id);

    @RequestMapping(value = "dept/list",method = RequestMethod.GET)
    public List<Dept> findAll();

}
