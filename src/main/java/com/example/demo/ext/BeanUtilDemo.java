package com.example.demo.ext;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import cn.hutool.core.bean.copier.ValueProvider;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.UUID;

/**
 * javaBean 的工具类
 */
public class BeanUtilDemo {
    public static void main(String[] args) {

        // 判断是否是javabean的对象，标准是一个类中包含属性，而且这个属性有set和get的方法操作。
        boolean isBean = BeanUtil.isBean(HashMap.class);//false
        System.out.println(isBean);

        //
        PropertyDescriptor[] propertyDescriptors = BeanUtil.getPropertyDescriptors(SubPerson.class);
        PropertyDescriptor propertyDescriptor = propertyDescriptors[0];
        System.out.println(propertyDescriptor);


        Person person = BeanUtil.fillBean(new Person(), new ValueProvider<String>() {
            public Object value(String key, Class<?> valueType) {
                switch (key) {
                    case "name":
                        return "张三";
                    case "age":
                        return 18;
                }
                return null;
            }

            @Override
            public Object value(String s, Type type) {
                return null;
            }

            @Override
            public boolean containsKey(String key) {
                //总是存在key
                return true;
            }

        }, CopyOptions.create());
    }
    }


class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

class SubPerson extends Person {
    public static final String SUBNAME = "TEST";

    private UUID id;
    private String subName;
    private Boolean isSlow;

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getSubName() {
        return subName;
    }
    public void setSubName(String subName) {
        this.subName = subName;
    }
    public Boolean isSlow() {
        return isSlow;
    }
    public void setSlow(Boolean isSlow) {
        this.isSlow = isSlow;
    }
}

