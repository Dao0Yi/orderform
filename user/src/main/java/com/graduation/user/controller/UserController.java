package com.graduation.user.controller;

import com.graduation.orderform.model.common.ResultBean;
import com.graduation.orderform.model.user.User;
import com.graduation.user.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService ;

    @RequestMapping("/verification")
    public ResultBean verification(User user) {
        User user1 = iUserService.getOneUser(user);
        ResultBean resultBean = new ResultBean();
        if (user1 != null) {
            resultBean.setStatus(200);
        } else {
            resultBean.setStatus(500);
        }
        resultBean.setMsg("产品列表");
        resultBean.setData(user1);
        return resultBean ;

    }

}
