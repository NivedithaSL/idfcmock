package com.ty.Idfcmock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.Idfcmock.Dao.Employeedao;
import com.ty.Idfcmock.Dto.Employeedto;

@RestController
public class Employee1 {
@Autowired
Employeedao employeedao;

@PostMapping("employee/insert")
public void insert(@RequestBody Employeedto dto) {
employeedao.insert(dto);
}
@DeleteMapping("employee/delete")
public void delete(@RequestBody Employeedto dto) {
	employeedao.delete(dto);
	
}
@GetMapping("employee/fetch")
public String fetch(@RequestBody Employeedto dto) {
	employeedao.fetch(dto);
	return "data fetched";
}
}