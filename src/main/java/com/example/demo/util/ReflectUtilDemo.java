package com.example.demo.util;

import cn.hutool.core.lang.Filter;
import cn.hutool.core.util.ReflectUtil;
import com.example.demo.clone.Cat;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 反射工具类
 * 获取构造方法
 * 获取字段
 * 获取字段值
 * 获取方法
 * 执行方法（对象方法和静态方法）
 */
public class ReflectUtilDemo {
    public static void main(String[] args) {
        Cat cat = ReflectUtil.newInstance(Cat.class);
        System.out.println(cat);
        // 获取某个类的所有方法
        Method[] methods = ReflectUtil.getMethods(Cat.class);
//        Arrays.stream(methods).forEach(System.out::println);

        // 获取某个类的指定方法
        Method abc = ReflectUtil.getMethod(Cat.class, "abc");

        // 使用反射调用某一个方法
        ReflectUtil.invoke(cat,abc,null);
        System.out.println(abc);
    }
}
