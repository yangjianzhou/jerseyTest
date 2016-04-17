package com.yangjianzhou.controller;

import com.google.gson.Gson;
import com.sun.jersey.api.core.InjectParam;
import com.yangjianzhou.dto.ProductDTO;
import com.yangjianzhou.service.ProductService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

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

    @GET
    @Path("get-all")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllProduct(){
       List<ProductDTO>  productDTOs = productService.getAllProduct();
        return new Gson().toJson(productDTOs);
    }

    @GET
    @Path("update-product-name")
    @Produces(MediaType.APPLICATION_JSON)
    public String updateProductName(@QueryParam("id") int id , @QueryParam("version") int version , @QueryParam("name") String name){
        productService.updateProductName(id , version , name);
        return "PENDING";
    }
}
