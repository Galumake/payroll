package com.sedesoft.payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sedesoft.payroll.model.Jobtitle;

@Repository
public interface JobTitleRepo extends JpaRepository<Jobtitle, Long> {

}
