package com.graduation.orderform.model.user;



import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Data
@Table(name = "t_user")
public class User {
    @GeneratedValue(generator = "UUID")
    private Long u_id ;
    private String u_name ;
    private String u_pwd ;
    private String u_address ;
}
