package com.ty.Idfcmock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.Idfcmock.Dto.Employeedto;

public interface UserRespository extends JpaRepository<Employeedto, Integer> {

}
