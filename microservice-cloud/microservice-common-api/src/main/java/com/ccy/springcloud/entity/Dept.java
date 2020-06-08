package com.ccy.springcloud.entity;

/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/4 16:57
 */

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain=true)
public class Dept implements Serializable {

    private Long deptno;

    private String dname;

    private String db_source;//mysql库的名称

}
