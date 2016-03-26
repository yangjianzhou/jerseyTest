package com.test.service;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.Md5Crypt;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.File;
import java.io.FileInputStream;

/**
 * Created by yangjianzhou on 15-11-22.
 */


@Path("/test")
public class HelloService {

    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    public String hello(@QueryParam("name") String name) {
        return "GET METHOD : " + name;
    }

    @POST
    @Path("/greet")
    @Produces(MediaType.APPLICATION_JSON)
    public String greet(@FormParam("name") String name) {
        return "POST METHOD : " + name;
    }

    public static void main(String[] args) throws Exception{
       /* System.out.println(getEncryption("yangjian pts/14       :0               Tue Aug  4 21:04   still logged in"));*/
        System.out.println(Md5Crypt.md5Crypt("yangjian pts/14       :0               Tue Aug  4 21:04   still logged in".getBytes()));
        String str = DigestUtils.md5Hex("yangjian pts/14       :0               Tue Aug  4 21:04   still logged in");

        System.out.println(str);
        str = DigestUtils.md5Hex(new FileInputStream(new File("/home/yangjianzhou/test.txt")));
        System.out.println(str);
        System.out.println(DigestUtils.md5Hex("123456\n"));
        System.out.println("e10adc3949ba59abbe56e057f20f883e");
    }


}
