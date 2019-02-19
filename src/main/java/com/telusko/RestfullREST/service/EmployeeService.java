package com.telusko.RestfullREST.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.telusko.RestfullREST.dao.EmployeeDAO;
import com.telusko.RestfullREST.model.Employee;


@Path("/employees")
public class EmployeeService {
	
@GET
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })

public List<Employee> getallemp_jsom()
{
List<Employee>listallemp = EmployeeDAO.getallemp();	
return listallemp;
}

@Path("/{empno}")
@GET
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })

public Employee getemp(@PathParam("empno") String empno)
{
	
	return EmployeeDAO.getemp(empno);
}

@Path("/{empno}")
@DELETE
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public Employee delemp(@PathParam("empno") String empno)
{
	
	return EmployeeDAO.delemp(empno);
}

}
