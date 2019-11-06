package com.baizhi.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Jsp")
public class JspAction {

    @RequestMapping("/jsp")
    public String jsp() throws Exception{
        System.out.println("jspjsp nishishabi hahah");
        return "index";
    }
}
