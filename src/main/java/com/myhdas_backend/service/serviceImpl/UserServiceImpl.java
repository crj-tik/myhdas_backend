package com.myhdas_backend.service.serviceImpl;

import com.myhdas_backend.bean.Tilt;
import com.myhdas_backend.bean.User;
import com.myhdas_backend.mapper.TiltMapper;
import com.myhdas_backend.mapper.UserMapper;
import com.myhdas_backend.service.TiltService;
import com.myhdas_backend.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author CRJ
 * @Date 2022.04.28/2022/4/28
 **/

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User queryName(String name) { return userMapper.queryName(name); }

    @Override
    public User queryPhone(int phone) { return userMapper.queryPhone(phone);
    }

    @Override
    public List<User> queryList() {
        return userMapper.queryList();
    }
}
