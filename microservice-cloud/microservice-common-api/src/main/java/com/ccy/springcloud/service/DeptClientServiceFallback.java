package com.ccy.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ccy.springcloud.entity.Dept;

/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/6 23:07
 */
@Component
public class DeptClientServiceFallback  implements DeptClientService{
    @Override
    public boolean addDept(Dept dept) {
        return false;
    }

    @Override
    public Dept findById(Long id) {
        return new Dept().setDeptno(id).setDname("该ID："+id+"没有对应的信息,客户端提供降级服务，此服务暂停")
                .setDb_source("no this database in Mysql");
//        return new Dept("信息不存在");
    }

    @Override
    public List<Dept> findAll() {
        return null;
    }
}
