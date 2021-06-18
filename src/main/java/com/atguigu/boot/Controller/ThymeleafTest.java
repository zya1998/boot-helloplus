package com.atguigu.boot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zya2062458380@qq.com
 * @date 2021-06-11 20:58
 */
@Controller
public class ThymeleafTest {
    @GetMapping("/hello")
    public String index(Model model){
        model.addAttribute("msg","你来到了index欢迎页面");
        return "index";
    }
}
