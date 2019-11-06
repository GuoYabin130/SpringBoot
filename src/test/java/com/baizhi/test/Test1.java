package com.baizhi.test;

import com.baizhi.Application;
import com.baizhi.dao.UserDAO;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class Test1 {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private UserService userService;

    @Test
    public void Test1(){
        User user = new User("1","郭亚彬","123456","13044408159","130@qq.com","192.168.0.91","管理员","微信","激活");
        userService.register(user);
    }

    @Test
    public void Test2(){
        for(Integer i=1;i<=10;i++){
            List<User> select = userService.select();
            for (User s:select){
                System.out.println(select);
            }
        }

    }

}
