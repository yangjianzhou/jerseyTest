package com.yangjianzhou.enums;

/**
 * Created by yangjianzhou on 16-4-13.
 */
public enum ProductType {

    BOOK(0),
    CLOTH(2),
    FOOD(3),
    ;

    private int value ;

    private ProductType(int value){
        this.value = value ;
    }

}
