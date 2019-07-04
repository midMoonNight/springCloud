package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptClientService;

@RestController
@RequestMapping("/consumer/dept")
public class DeptController_Consumer {
	@Autowired
	private DeptClientService service;

	@RequestMapping(value = "/add")
	public boolean add(Dept dept) {
		return service.add(dept);
	}

	@RequestMapping(value = "/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return service.get(id);
	}

	@RequestMapping(value = "/list")
	public List<Dept> list() {
		return service.list();
	}

}
