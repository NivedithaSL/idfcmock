package com.ty.Idfcmock.Dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ty.Idfcmock.Dto.Employeedto;
import com.ty.Idfcmock.repository.UserRespository;
@Component
public class Employeedao {
@Autowired
UserRespository respository;
	public void insert(Employeedto dto) {
		// TODO Auto-generated method stub
		respository.save(dto);
	}
	
	public void delete(Employeedto dto) {
		// TODO Auto-generated method stub
		respository.delete(dto);
	}

	public void fetch(Employeedto dto) {
		// TODO Auto-generated method stub
		Optional<Employeedto> dto3=respository.findById(dto.getEmp_id());
	
	}


}
