package com.example.demo.util;

import cn.hutool.core.lang.Assert;

/**
 * isTrue 是否True
 * isNull 是否是null值，不为null抛出异常
 * notNull 是否非null值
 * notEmpty 是否非空
 * notBlank 是否非空白符
 * notContain 是否为子串
 * notEmpty 是否非空
 * noNullElements 数组中是否包含null元素
 * isInstanceOf 是否类实例
 * isAssignable 是子类和父类关系
 * state 会抛出IllegalStateException异常
 */
public class AssertUtilDemo {
    public static void main(String[] args) {
        Assert.isTrue(true);
//        Assert.isNull("abc");
    }
}
