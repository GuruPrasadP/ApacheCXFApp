package com.employee.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.employee.domain.Employee;
@Path("/employee")
public class EmployeeController {

	@GET
	@Path("/retrieve-by-id/{empid}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response employeeDetails(@PathParam("empid") Integer empId) {
		Employee employee = new Employee(empId,  empId+" name");
		return Response.status(200).entity(employee).build();
	}

}
