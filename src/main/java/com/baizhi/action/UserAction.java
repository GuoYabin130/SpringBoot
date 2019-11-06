package com.baizhi.action;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
    private UserService userService;

    @RequestMapping("/selectAll")
    @ResponseBody
    public Map<String,Object> selectAll(Integer page, Integer rows) throws Exception{
        System.out.println("我我我我我我");
        HashMap<String, Object> map = new HashMap<>();
        List<User> users = userService.selectAll(page, rows);
        Integer userstotal = userService.selectCount();
        Integer pageCount;
        if(userstotal%rows==0){
            pageCount=userstotal/rows;
        }else{
            pageCount=userstotal/rows+1;
        }
        //页数
        map.put("total",pageCount);
        //总条数
        map.put("records",userstotal);
        //当前页面
        map.put("page",page);
        //传递数据
        map.put("rows",users);
        return map;
    }

    //增删改
    @RequestMapping("/edit")
    @ResponseBody
    public String edit(String oper,User user) throws Exception{
        if("add".equals(oper)){
           userService.register(user);
        }else if("edit".equals(oper)){
            System.out.println(user+"++++++++++++");
            userService.update(user);
        }else if("del".equals(oper)){
            userService.delete(user.getId());
        }
        return null;
    }

}
