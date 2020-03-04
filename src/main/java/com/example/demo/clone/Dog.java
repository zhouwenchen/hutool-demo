package com.example.demo.clone;

import cn.hutool.core.clone.CloneSupport;
import cn.hutool.core.util.ObjectUtil;

import java.io.Serializable;

/**
 *  实现了 CloneSupport 可以直接使用 调用clone，实现深度拷贝
 */
public class Dog extends CloneSupport<Dog> implements Serializable {
    private String name = "abc";
    private int age = 2;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog clone = dog.clone();
        System.out.println(dog);
        System.out.println(clone);

        // 第二种使用深度拷贝实现,该对象必须要实现  Serializable 接口才可以实现
        Dog dog2 = ObjectUtil.cloneByStream(dog);
        System.out.println(dog2);
    }
}
