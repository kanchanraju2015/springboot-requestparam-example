package com.briz.reqparam;

import java.util.List;
import java.util.Optional;


import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

 
@RestController
public class EmployeeController
{
@Autowired
EmployeeRepository erepo;
@RequestMapping("/test")
public String test()
{
	return "this is request Param test";
}
@RequestMapping("/save")
public String save()
{
	Employee e=new Employee();
	e.setAge(33);
	e.setCity("delhi");
	e.setName("manjeet");
	erepo.save(e);
	return "data saved";
}
/*
@RequestMapping("/by/{name}")
public Employee byname(@PathVariable String name)
{
return erepo.findByName(name);
}
@RequestMapping("/all")
public List<Employee> all()
{
	return erepo.findAll();
}
@RequestMapping("/employee")//http://localhost:8080/employee?id=2 single valued
public Optional<Employee> byid(@RequestParam int id)
{
return erepo.findById(id);	
}
@RequestMapping("/emp")//http://localhost:8080/emp?id=2&name=manohar no spaces for multiple parameter
public Employee two(@RequestParam int id,@RequestParam String name)
{
	return erepo.findByIdAndName(id, name);
}
@RequestMapping("/employees")//http://localhost:8080/employees?id=1,2 same is below example 
//http://localhost:8080/employees?id=1&id=2 this is also valid here for multiple data at once same as above
public List<Employee> allbyid(@RequestParam List<Integer> id)// check the parameter list important note 
{
	return erepo.findAllById(id); // note this method for multiple parameters 
}
@RequestMapping("/hello/test1")
public String test1(@RequestParam int id)
{
	return "your id is "+id;
}
*/
@RequestMapping("/id/name")// check through the param in postman example 
public String checkbyid(@RequestParam("id")int id,@RequestParam("name")String name)
{
return id+"   "+name;
}
}
