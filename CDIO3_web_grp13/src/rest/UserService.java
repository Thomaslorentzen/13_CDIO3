package rest;


import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/find")
public class UserService {
	@Path("/users")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String ShowUsers() {
//		String Users = "all users";
		ArrayList<String> allUsers = new ArrayList<String>();
		allUsers.add("test");
		allUsers.add("test1");
		allUsers.add("test2");
		String Users = "p";
//		String result = "@Produces(\"application/xml\") Output: \n\nUsers Found: \n\n" + Users;
		return "<UserService>" + "<Users>" + Users + "</Users>" + "</UserService>";
	}

	@Path("/user/{id}")
	@GET
	@Produces("application/json")
	public String findUserOnId(@PathParam("id") Integer id) {
		String response1 = "Benny";
		
		String result = "@Produces(\"application/xml\") Output: \n\nUser Found: \n\n" + response1;
		return "<FindUserOnId>" + "<id>" + id + "</id>" + "<User>" + result + "</User>" + "</FindUserOnId>";
	}
}