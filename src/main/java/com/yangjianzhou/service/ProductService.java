package com.yangjianzhou.service;

import com.yangjianzhou.dao.enums.ProductType;
import com.yangjianzhou.dto.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by yangjianzhou on 16-4-16.
 */

@Service
public class ProductService extends BaseService{

    public void saveProduct(){
        ProductDTO productDTO = new ProductDTO();
        productDTO.setName("thisi si ");
        productDTO.setType(ProductType.CLOTH);
        productDTO.setCreatedAt(new Date());
        productDTO.setCreatedBy("SYS");
        productDTO.setUpdatedAt(new Date());
        productDTO.setUpdatedBy("SYS");
        productDAO.insert(productDTO);
    }
}
