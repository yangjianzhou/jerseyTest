package com.yangjianzhou.service;

import com.yangjianzhou.dao.enums.ProductType;
import com.yangjianzhou.dto.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

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

    public List<ProductDTO> getAllProduct(){
        return productDAO.selectAll();
    }

    public void updateProductName(int productId , int version , String name ){
        ProductDTO productDTO = new ProductDTO();
        productDTO.setUpdatedAt(new Date());
        productDTO.setUpdatedBy("SYS");
        productDTO.setName(name);
        productDTO.setId(productId);
        productDTO.setVersion(version);
        productDAO.updateNameById(productDTO);
    }

}
