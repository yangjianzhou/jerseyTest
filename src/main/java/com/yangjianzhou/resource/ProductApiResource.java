package com.yangjianzhou.resource;

import com.sun.jersey.api.core.InjectParam;
import com.yangjianzhou.bean.ResultGson;
import com.yangjianzhou.dto.ProductDTO;
import com.yangjianzhou.service.ProductService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by yangjianzhou on 16-4-17.
 */

@Path("test")
public class ProductApiResource {
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
    public ResultGson<List<ProductDTO>> getAllProduct(){
        ResultGson<List<ProductDTO>> resultGson = productService.getAllProduct();
        return resultGson;
    }

    @GET
    @Path("update-product-name")
    @Produces(MediaType.APPLICATION_JSON)
    public String updateProductName(@QueryParam("id") int id , @QueryParam("version") int version , @QueryParam("name") String name){
        productService.updateProductName(id , version , name);
        return "PENDING";
    }

}
