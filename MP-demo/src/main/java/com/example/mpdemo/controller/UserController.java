package com.example.mpdemo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mpdemo.model.User;
import com.example.mpdemo.service.IUserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Description：
 * User: lmp
 * Date: 2023-10-01
 * Time: 12:32(李明浦)
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserSevice userService;

    @RequestMapping("/add")
    public int add(User user){
        //1.非空校验
        if(user == null || !StringUtils.hasLength(user.getName())){
            return 0;
        }
        //2.执行数据库的添加操作
        boolean result =  userService.save(user);
        return result?1:0;
    }

    @RequestMapping("/getlist")
    public List<User> getlist(){
        List<User> list = userService.list();
        return list;
    }

    @RequestMapping("/getpage")
    public Object getPage(Integer p){
        //分页对象，传递两个参数，第一个是传递的页码，第二个是每页显示多少行
        Page page = new Page(p,2);
        Page<User> result = userService.page(page);
        return result;
    }

    @RequestMapping("/daoxugetpage")
    public Object daoxugetPage(Integer p){
        //分页对象，传递两个参数，第一个是传递的页码，第二个是每页显示多少行
        Page page = new Page(p,2);
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.orderBy(true,false,"id");
        Page<User> result = userService.page(page,wrapper);
        return result;
    }
}
