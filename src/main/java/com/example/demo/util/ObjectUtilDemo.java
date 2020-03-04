package com.example.demo.util;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.ObjectUtil;
import com.example.demo.clone.Cat;

import java.util.Arrays;

/**
 * ObjectUtil 的测试
 */
public class ObjectUtilDemo {
    public static void main(String[] args) {
        boolean b = ObjectUtil.equal("", "");
        System.out.println(b);

        int abc = ObjectUtil.length("abc");
        System.out.println(abc);

        boolean contains = ObjectUtil.contains(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9), 1);
        System.out.println(contains);

        // 克隆模式
        Cat cat = new Cat();
        Class<Cat> catClass = ObjectUtil.clone(Cat.class);
        try {
            Cat catnew = catClass.newInstance();

            Console.log(cat.toString());
            Console.log(catnew.toString());
            Console.log(ObjectUtil.equal(cat,catnew));
        }catch (Exception e){
            e.printStackTrace();
        }

        //
        Cat cat1 = ObjectUtil.cloneIfPossible(cat);
        System.out.println(cat1);
        Console.log(ObjectUtil.equal(cat,cat1));

        // 序列化和非序列化，需要实现 Serializable 的接口
        byte[] serialize = ObjectUtil.serialize(cat);
        System.out.println(serialize);
        Object deserialize = ObjectUtil.deserialize(serialize);
        System.out.println(deserialize);

        // 判断基本类型 ,基本类型和包装类型
        boolean abc1 = ObjectUtil.isBasicType(Integer.parseInt("123"));
        System.out.println(abc1);
    }
}
