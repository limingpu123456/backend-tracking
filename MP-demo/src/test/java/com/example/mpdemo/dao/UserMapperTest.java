package com.example.mpdemo.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.mpdemo.model.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Description：
 * User: lmp
 * Date: 2023-10-01
 * Time: 11:03(李明浦)
 */
@SpringBootTest
class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void insert(){
        User user = new User();
        user.setName("lmp");
        user.setAge(18);
        user.setEmail("qq.com");
        int result =  userMapper.insert(user);
        System.out.println("添加"+result);
    }

    @Test
    public void update(){
        User user = new User();
        user.setName("lmp2");
        UpdateWrapper<User> wrapper = new UpdateWrapper<>();
        wrapper.eq("id",6);
        int result = userMapper.update(user,wrapper);
        System.out.println("修改"+result);
    }

    @Test
    public void  del(){
        int result = userMapper.deleteById(6);
        System.out.println("删除"+result);
    }

    @Test
    public void getAll(){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.gt("id",3);
        List<User> list = userMapper.selectList(queryWrapper);
        System.out.println(list);
    }
}