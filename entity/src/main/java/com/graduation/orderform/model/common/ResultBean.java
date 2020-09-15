package com.graduation.orderform.model.common;

import lombok.Data;

@Data
public class ResultBean {
    private int status ;
    private String msg ;
    private Object data ;
}
