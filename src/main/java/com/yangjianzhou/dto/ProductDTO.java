package com.yangjianzhou.dto;

/**
 * Created by yangjianzhou on 16-4-13.
 */
public class ProductDTO extends BaseDTO{

    private String name ;

    private int type ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
