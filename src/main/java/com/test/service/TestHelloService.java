package com.test.service;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import org.apache.commons.codec.digest.DigestUtils;

import javax.ws.rs.core.MediaType;
import java.io.File;
import java.io.FileInputStream;
import java.net.URI;

/**
 * Created by yangjianzhou on 15-11-22.
 */
public class TestHelloService {

    public static void main(String[] args) throws Exception {

    }

    public static void testHello() throws Exception {
        Client client = Client.create();
        URI uri = new URI("http://localhost:8080/jerseyTest/service/test/hello?name=yangjianzhou");
        WebResource resource = client.resource(uri);
        String result = resource.get(String.class);
        System.out.println(result);
    }

    public static void testGreet() throws Exception {
        Client client = Client.create();
        URI uri = new URI("http://localhost:8080/jerseyTest/service/test/greet");
        WebResource resource = client.resource(uri);
        MultivaluedMapImpl params = new MultivaluedMapImpl();
        params.add("name", "yangjianzhou");
        String result = resource.queryParams(params).type(MediaType.APPLICATION_FORM_URLENCODED_TYPE).post(String.class);
        System.out.println(result);
    }

}
