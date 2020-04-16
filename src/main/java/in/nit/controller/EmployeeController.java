package in.nit.controller;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/emp1/")
public class EmployeeController {

	@GET
	public String empget()
	{
		return "getting/fatching data";
	}
	@POST
	public String emppost()
	{
		return "posting the data";
	}
	@PUT
	public String empput()
	{
		return "puting/updating the data";
	}
	@DELETE
	public String empdelet()
	{
		return "deleting the data";
	}
}
