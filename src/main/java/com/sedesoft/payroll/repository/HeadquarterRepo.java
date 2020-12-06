package com.sedesoft.payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sedesoft.payroll.model.Headquarter;

@Repository
public interface HeadquarterRepo extends JpaRepository<Headquarter, Long>{

}
