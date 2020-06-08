package com.ccy.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ccy.springcloud.entity.Dept;

import feign.hystrix.FallbackFactory;


/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/6 13:54
 */
@Component //不能忘记，不能忘记
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService(){

            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public Dept findById(Long id) {
            	System.out.println("异常："+throwable);
                return new Dept().setDeptno(id).setDname("FallbackFactory接口信息：该ID："+id+"没有对应的信息,客户端提供降级服务，此服务暂停")
                        .setDb_source("no this database in Mysql");
//            	return new Dept("异常");
            }

            @Override
            public List<Dept> findAll() {
                return null;
            }
        };
    }
}
