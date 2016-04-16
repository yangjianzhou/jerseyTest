package com.yangjianzhou.controller;

import com.sun.jersey.api.core.InjectParam;
import com.yangjianzhou.service.ProductService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by yangjianzhou on 16-4-10.
 */

@Path("test")
public class TestController {

    @InjectParam
    private ProductService productService ;

    @GET
    @Path("insert")
    @Produces(MediaType.APPLICATION_JSON)
    public String testInsert(){
        productService.saveProduct();
        return "PENDING";
    }
}
