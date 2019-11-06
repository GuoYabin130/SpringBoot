package com.baizhi.action;

import com.baizhi.entity.User;
import com.sun.javafx.collections.MappingChange;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/receive")
public class ReceiveAction {

    @RequestMapping("/r1")
    public String r1(String name,Integer age) throws Exception{
        System.out.println(name);
        System.out.println(age);
        return "index";
    }

    @RequestMapping("/r2")
    public String r2(User user) throws Exception{
        System.out.println(user+"+++++++");
        return "index";
    }
    @RequestMapping("/r3")
    public String r3(Integer[] hobby) throws Exception{
        for(Integer i=0;i<hobby.length;i++){
            System.out.println(hobby[i]);
        }
        return "index";
        //指定跳转方式
        // return "redirect:/index.jsp"
    }

    @RequestMapping("/r4")
    public String r4(Model model,ModelMap map) throws Exception{
        User user = new User();
        User user2 = new User();
        user.setId("123441");
        user2.setId("1315454");
        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        map.addAttribute("users",users);
        model.addAttribute("user",user);
        return "test3";
    }
}
