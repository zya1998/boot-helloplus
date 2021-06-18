package com.atguigu.boot.Controller;

import com.atguigu.boot.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zya2062458380@qq.com
 * @date 2021-06-11 15:49
 */
@Controller
public class TestYamlController {
    @Autowired
    Student student;
    @ResponseBody
    @RequestMapping("/student01")
    public Student studnet01(){
        return student;
    }
}
