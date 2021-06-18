package com.atguigu.boot.bean;

import lombok.Data;
import lombok.ToString;

import java.util.Map;

/**
 * @author zya2062458380@qq.com
 * @date 2021-06-11 15:37
 */
@Data
@ToString
public class Book {
    String name;
    Double price;
    String author;
}
