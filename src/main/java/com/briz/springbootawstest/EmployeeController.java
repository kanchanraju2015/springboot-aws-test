package com.briz.springbootawstest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// for running the application on cloud of aws 
// http://ec2-13-201-192-45.ap-south-1.compute.amazonaws.com:8080/all by public dns check
// http://13.201.192.45:8080/test  by ip address check
// note 8080 is the port number on which my application is running in local and cloud both

// KINDLY CHECK THE POM.XML FILE FOR JAR FILE NAME UNDER BUILD TAG
@RestController
public class EmployeeController 
{
@RequestMapping("/test")
public String test()
{
	return "this is aws test";
}
@RequestMapping("/all")
public List<Employee> allemp()
{	
	Employee e1=new Employee(56,"ranjan");
	Employee e2=new Employee(43,"mohan");
	Employee e3=new Employee(86,"sohan");
	Employee e4=new Employee(26,"chandan");
	List<Employee> e=Arrays.asList(e1,e2,e3,e4);
	return e;
}
}
