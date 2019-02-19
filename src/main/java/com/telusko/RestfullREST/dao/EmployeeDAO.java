package com.telusko.RestfullREST.dao;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 

import com.telusko.RestfullREST.model.Employee;
public class EmployeeDAO {
	
	private static final Map<String, Employee> empMap = new HashMap<String, Employee>();
	
	static {
		
		intEmps();
	 
	}
	
	private static void intEmps()
	{
		
		Employee employee1 = new Employee("E01", "pramod", "manager");
		Employee employee2 = new Employee("E02", "nandini", "Salesman");
		Employee employee3 = new Employee("E03", "babay", "clerk");
		Employee employee4 = new Employee("E04", "nisha", "home");
		Employee employee5 = new Employee("E05", "atul", "nashik");
		empMap.put(employee1.getEmpno(), employee1);
		empMap.put(employee2.getEmpno(), employee2);
		empMap.put(employee3.getEmpno(), employee3);
		
		empMap.put(employee4.getEmpno(), employee4);
		
		empMap.put(employee5.getEmpno(), employee5);
		
	}
	
	public static Employee getemp(String empno)
	{
		
		
		return empMap.get(empno);
		
		
	}
	
	public static Employee delemp(String empno)
	
	{
		
		
		return empMap.remove(empno);
		
		
		
	}
	
	public static Employee updateemp(Employee empno)
	{
		 empMap.put(empno.getEmpno(), empno);
		 return empno;
	}
	
	public static List<Employee> getallemp()
	{
		Collection<Employee> c = empMap.values();
		List<Employee>list = new ArrayList<Employee>();
		list.addAll(c);
		
		return list;
		
		
	}
	

}
