package com.atguigu.boot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author zya2062458380@qq.com
 * @date 2021-06-11 15:28
 */
@Component
@ConfigurationProperties(prefix = "student")
@Data
@ToString
public class Student {
    String userName;
    int age;
    String name;
    String[] project;
    List<Book> books;
    Book book;
    Map<String,List<Book>> listBooks;
    Date date;
    Set<Book> set;
}
