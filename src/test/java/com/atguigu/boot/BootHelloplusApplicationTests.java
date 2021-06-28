package com.atguigu.boot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

@SpringBootTest
class BootHelloplusApplicationTests {
    @Autowired
    DataSource dataSource;
    @Test
    public void test1(){
        System.out.println(dataSource.getClass());
    }

}
