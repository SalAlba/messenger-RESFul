package com.sal.alba.Messenger.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/injectdemo")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class InjectDemoResource {

	// methods ...

	// url -> /webapi/injectdemo/matrixAnnotation;param=value
	@GET
	@Path("matrixAnnotation")	
	public String getParamUsingAnnotations(@MatrixParam("param") String param){
		return "Matrix param : "+param;
	}	
	
	
	// url -> /webapi/injectdemo/headerAnnotation
	// we have send head to this usrl 
	@GET
	@Path("headerAnnotation")
	public String getHeaderUsingAnnotations(@HeaderParam("customHeaderValue") String header){
		return "Header param : "+header;
	}
	
	// url -> /webapi/injectdemo/cookieAnnotation
	// check in cookie section
	@GET
	@Path("cookieAnnotation")
	public String getCookieUsingAnnotations(@CookieParam("name") String name){
		return "Cookie param : "+name;
	}
	

	// url -> /webapi/injectdemo/all;param=val
	// add value in head section for @HeaderParam -> customHeaderValue 
	@GET
	@Path("all")
	public String getAll(
				@MatrixParam("param") String param,
				@HeaderParam("customHeaderValue") String header,
				@CookieParam("name") String name)
	{
		return "Matrix param : "+param+" ,Header param : "+header+" Cookie param : "+name;
	}
	
	
	@GET
	@Path("context")
	public String getParamUsingContext(@Context UriInfo uriInfo, @Context HttpHeaders headers){
		String path = uriInfo.getAbsolutePath().toString();
		String cookie = headers.getCookies().toString();
		
		return "Path : "+path+" ,cookie : "+cookie;
	}


}













