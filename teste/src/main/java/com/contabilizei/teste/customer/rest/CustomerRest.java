package com.contabilizei.teste.customer.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.contabilizei.teste.customer.controller.CustomerController;
import com.contabilizei.teste.customer.model.Customer;

@Path("/customer")
public class CustomerRest {
	
	private CustomerController controller = new CustomerController();
	
	@GET
	@Path("/getCustomer/{customer}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCustomer(@PathParam("customer") Integer id ){
		return Response.ok(this.controller.findById(id)).build(); 
	}
	
	@GET
	@Path("/getAllCustomer")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllCustomer(){
		return Response.ok(this.controller.findAll()).build(); 
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(Customer customer){
		this.controller.create(customer);
		return Response.ok("Contato salvo com sucesso").type(MediaType.TEXT_PLAIN).build();
	}
	
	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response update(Customer customer){
		Customer customerReturn = this.controller.update(customer);
		return Response.ok(customerReturn.getName() + " atualizado!").build();
	}
	
	@DELETE
	@Path("/deleteCustomer/{id}")
	public Response delete (@PathParam("id") int id){
		this.controller.delete(id);
		return Response.ok("Cliente Excluido").build();
		
	}

}
