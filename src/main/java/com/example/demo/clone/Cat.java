package com.example.demo.clone;

import cn.hutool.core.clone.CloneRuntimeException;

import java.io.Serializable;

/**
 * 猫猫类，使用实现Cloneable方式
 * 深度拷贝，修改某一个对象，不影响另一个
 * @author Looly
 *
 */
public class Cat implements Cloneable, Serializable {
    private String name = "miaomiao";
    private int age = 2;

    @Override
    public Cat clone() {
        try {
            Cat cat = (Cat) super.clone();
            return cat;
        } catch (CloneNotSupportedException e) {
            throw new CloneRuntimeException(e);
        }
    }

    public void abc(){
        System.out.println("abc");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = cat.clone();
        System.out.println(cat + "\t" +cat.name + "\t" + cat.age );
        System.out.println(cat1 + "\t" +cat1.name + "\t" + cat1.age );
        System.out.println("修改cat1中的值");

        cat1.name = "miao33";
        System.out.println(cat + "\t" +cat.name + "\t" + cat.age);
        System.out.println(cat1 + "\t" +cat1.name + "\t" + cat1.age);
    }
}
