package com.example.mpdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo.dao.UserMapper;
import com.example.mpdemo.model.User;
import com.example.mpdemo.service.IUserSevice;
import org.springframework.stereotype.Service;

/**
 * Description：
 * User: lmp
 * Date: 2023-10-01
 * Time: 12:29(李明浦)
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserSevice {
}
