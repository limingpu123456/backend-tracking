package com.example.mpdemo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Description：
 * User: lmp
 * Date: 2023-10-01
 * Time: 10:50(李明浦)
 */
@Data
@Setter
@Getter
public class User {
    //使用默认数据库的自增id
    @TableId(type = IdType.AUTO)
    private long id;
    //注解里面的是数据库里面的名字
    @TableField("name")
    private String name;
    private int age;
    private String email;
}
