package com.yangjianzhou.dao;

import com.yangjianzhou.dto.ProductDTO;
import org.springframework.stereotype.Repository;

/**
 * Created by yangjianzhou on 16-4-13.
 */

@Repository
public class ProductDAO extends AbstractJerseyDAO {

    public void insert(ProductDTO productDTO){
        this.insert("tb_product.insert" , productDTO);
    }

}
