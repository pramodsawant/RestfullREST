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
		Employee employee6 = new Employee("E06", "asha", "old nsk");
		Employee employee7 = new Employee("E07", "jaya", "cidco");
		Employee employee8 = new Employee("E08", "aasha", "nashik");
		Employee employee9 = new Employee("E09", "aasha", "nashik");
		Employee employee10 = new Employee("E10", "newbaye", "dombivali");
		Employee employee11 = new Employee("E11", "newbaye11", "11dombivali");
		Employee employee111 = new Employee("E111", "newbaye111", "111dombivali");
		Employee employee12 = new Employee("E12", "newbaye12", "12dombivali");
		
		empMap.put(employee1.getEmpno(), employee1);
		empMap.put(employee2.getEmpno(), employee2);
		empMap.put(employee3.getEmpno(), employee3);
		
		empMap.put(employee4.getEmpno(), employee4);
		
		empMap.put(employee5.getEmpno(), employee5);
		empMap.put(employee6.getEmpno(), employee6);
		empMap.put(employee7.getEmpno(), employee7);
		empMap.put(employee8.getEmpno(), employee8);
		empMap.put(employee9.getEmpno(), employee9);
		empMap.put(employee10.getEmpno(), employee10);
		empMap.put(employee11.getEmpno(), employee11);
		empMap.put(employee111.getEmpno(), employee111);
		
		empMap.put(employee12.getEmpno(), employee12);
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
