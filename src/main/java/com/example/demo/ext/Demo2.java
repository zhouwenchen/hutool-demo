package com.example.demo.ext;

import cn.hutool.extra.spring.SpringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * TODO 未完成
 */
// 扫描cn.hutool.extra.spring包下所有类并注册之
@ComponentScan(basePackages={"cn.hutool.extra.spring"})
@Import(cn.hutool.extra.spring.SpringUtil.class)
public class Demo2{
    private long id;
    private String name;

    @Bean(name="testDemo")
    public Demo2 generateDemo() {
        Demo2 demo = new Demo2();
        demo.setId(12345);
        demo.setName("test");
        return demo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        final Demo2 testDemo = SpringUtil.getBean("testDemo");
        System.out.println(testDemo);
    }
}
