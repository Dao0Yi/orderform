package com.graduation.user.services;

import com.graduation.orderform.model.user.User;
import com.graduation.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper ;


    @Override
    public User getOneUser(User user) {
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("u_name", user.getU_name());
        criteria.andEqualTo("u_pwd", user.getU_pwd());
        return userMapper.selectOneByExample(example);
    }
}
