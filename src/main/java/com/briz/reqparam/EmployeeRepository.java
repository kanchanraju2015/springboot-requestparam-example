package com.briz.reqparam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{
Employee findByIdAndName(int id,String name);
Employee findByName(String name);
}
