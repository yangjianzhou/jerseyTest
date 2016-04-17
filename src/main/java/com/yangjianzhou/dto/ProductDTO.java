package com.yangjianzhou.dto;

import com.yangjianzhou.dao.enums.ProductType;

/**
 * Created by yangjianzhou on 16-4-13.
 */
public class ProductDTO extends BaseDTO{

    private String name ;

    private ProductType type ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }
}
