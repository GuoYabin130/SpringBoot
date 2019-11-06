package com.baizhi.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloAction {

    //这是同事修改过得
	//你没有同事  不要自欺欺人
    @RequestMapping("/boot")
    @ResponseBody
    public String boot() throws Exception{
        System.out.println("hello world");
        return "hello world";
    }
}
