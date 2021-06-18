package com.atguigu.boot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @author zya2062458380@qq.com
 * @date 2021-06-11 18:39
 */
@Controller
public class RequestTestController {
//    @ResponseBody
    @RequestMapping("/stu01")
    public String stu01(HttpServletRequest request){
        request.setAttribute("msg1","请求转发1");
        request.setAttribute("msg2","请求转发2");
        request.setAttribute("msg2","请求转发3");
        return "forward:/stu02";
    }

    @ResponseBody
    @RequestMapping("/stu02")
    public Map<String,String> stu02(@RequestAttribute("msg1") String msg1,@RequestAttribute("msg2") String msg2){
        Map<String,String> map = new HashMap<>();
        map.put("msg1",msg1);
        map.put("msg2",msg2);
        return map;
    }
    @RequestMapping("/stu03/{s1}/{s2}")
    @ResponseBody
    public String testMax(@MatrixVariable(name = "id",pathVar = "s1") String userName1,@MatrixVariable(name = "id",pathVar = "s2") String userName2){
        System.out.println(userName1);
        System.out.println(userName2);
        return "userName1=" + userName1 + "userName2=" + userName2;
    }
}
