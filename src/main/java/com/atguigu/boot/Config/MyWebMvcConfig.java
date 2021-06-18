package com.atguigu.boot.Config;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.util.UrlPathHelper;

/**
 * @author zya2062458380@qq.com
 * @date 2021-06-11 19:17
 */
@Component
public class MyWebMvcConfig implements WebMvcConfigurer{
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        UrlPathHelper urlPathHelper = new UrlPathHelper();
        configurer.setUrlPathHelper(urlPathHelper);
        urlPathHelper.setRemoveSemicolonContent(false);
    }

    /**
     * Configure content negotiation options.
     *
     * @param configurer
     */



}
