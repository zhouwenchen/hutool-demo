package com.example.demo.util;

import cn.hutool.core.util.ReflectUtil;
import cn.hutool.core.util.TypeUtil;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * 泛型的工具类
 * 针对 java.lang.reflect.Type 的工具类封装，最主要功能包括：
 *
 * 获取方法的参数和返回值类型（包括Type和Class）
 * 获取泛型参数类型（包括对象的泛型参数或集合元素的泛型类型）
 */
public class TypeUtilDemo {

    public List<String> getList(){
        return new ArrayList<>();
    }

    public Integer intTest(Integer integer) {
        return 1;
    }

    public static void main(String[] args) {
        Method intTest = ReflectUtil.getMethod(TypeUtilDemo.class, "intTest", Integer.class);
        Type paramType = TypeUtil.getParamType(intTest, 0);
        System.out.println(paramType);
    }
}
