package com.ts.rest;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/myresource")
public class MyResource {
    StudentDAO dao = new StudentDAO();
	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	
	@GET 
    @Path("/hi")
    @Produces("text/plain")
    public String getIt() {
        return "Hi there! Angular REST SERVICES";
    }
    @GET 
    @Path("/hello")
    @Produces("text/plain")
    public String hello() {
        return "Hello there! WECCOME TO BVRIT";
    }
    @POST
	@Path("/registrationform")
	@Consumes(MediaType.APPLICATION_JSON)
    public String addMember(Student student) throws IOException {
    		StuDAO s = new StuDAO();
    		if (s.addUser(student)) {
    			System.out.println("Successfully Inserted\n");
    			return "Successfully Inserted";
    		} else {
    			System.out.println("Not Inserted\n");
    			return "Not Inserted";
    		}
    }
    @DELETE
	@Path("/deleterow")
	@Consumes(MediaType.APPLICATION_JSON)
    public String deleteMember(Student student) throws IOException {
    		StuDAO s = new StuDAO();
    		if (s.deleteUser(student)) {
    			System.out.println("Successfully deleted\n");
    			return "Successfully deleted";
    		} else {
    			System.out.println("Not deleted\n");
    			return "Not deleted";
    		}
    }
    @PUT
    @Path("/update")
    @Consumes({ "application/xml", "application/json" })
    public Student edit(Student entity) {
    	System.out.println(entity.getId()+" "+entity.getName());
        return dao.update(entity);
    }
  	
  	@POST
  	@Path("/insert")
    @Consumes({ "application/xml", "application/json" })
    public Student save(Student entity) {
        return dao.save(entity);
    }
  	
  	UserRegDAO ud = new UserRegDAO();
  	@POST
  	@Path("/userentry")
    @Consumes({ "application/xml", "application/json" })
    public UserReg user(UserReg u) {
        return ud.userentry(u);
    }
  	
    @DELETE
    @Path("remove/{id}")
    public Student remove(@PathParam("id") Integer id) {
        return dao.delete(id);
    }

    @GET
    @Path("{id}")
    @Produces({ "application/json" })
    public Student find(@PathParam("id") Integer id) {
        System.out.println("Called"+id);
    	return dao.getPerson(id);
    }
    EventRegDAO er = new EventRegDAO();
     
    @POST
   	@Path("/evententry")
    @Consumes({ "application/xml", "application/json" })
    public EventReg user(EventReg e) {
    	System.out.println(e.getUname());
    	System.out.println(e.isDecoration());
		System.out.println(e.isVenue());
		System.out.println(e.isPhotography());
		System.out.println(e.isCatering());
        return er.evententry(e);
    }
     
    @GET
    @Path("/getAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Event> findAll() {
        return er.getAll();
    }
    
    @POST
	@Path("/register1")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void addStudent(@FormParam("id") int id, @FormParam("name") String name, @Context HttpServletResponse res) throws IOException {
		System.out.println("Hi! save called..."+id+" "+name);
	}
    
    
    AdminLoginDAO ald = new AdminLoginDAO();
    @POST
    @Path("/valid")
    @Consumes({ "application/xml", "application/json" })
    public void check(AdminLogin l){
    	if(ald.validate(l) == true){
    		System.out.println("Welcome to Your Site");
    	}
    	else
    		System.out.println("You are not authorized");
    }
    
    UserLoginDAO uld = new UserLoginDAO();
    @POST
    @Path("/validUser")
    @Consumes({ "application/xml", "application/json" })
    public void check(UserLogin u){
    	if(uld.validate(u) == true){
    		System.out.println("Welcome to Your Site");
    	}
    	else{
    		System.out.println("You are not authorized");
    	}
    }
}
