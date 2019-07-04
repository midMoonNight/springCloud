package com.atguigu.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Dept implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * 主键
     */
    private Long deptno;
    /**
     * 部门名称
     */
    private String dname;
    /**
     * 来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一信息被存储到不同数据库
     */
    private String db_source;
}
