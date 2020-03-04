package com.example.demo.io;

import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.lang.Console;
import cn.hutool.setting.dialect.Props;

import java.io.IOException;
import java.util.Properties;

/**
 * classPath demo的测试
 */
public class ClassPathDemo {
    public static void main(String[] args) throws IOException {
        ClassPathResource classPathResource = new ClassPathResource("application.properties");
        Properties properties = new Properties();
        properties.load(classPathResource.getStream());
        String abc = properties.getProperty("abc");

        Console.log("Properties:{}->{}",properties,abc);

        Props props = new Props("application.properties");
        String abc1 = props.getStr("abc");
        System.out.println(abc1);

    }
}
