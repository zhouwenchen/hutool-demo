package com.example.demo.util;

import cn.hutool.core.util.NumberUtil;

/**
 * 数字工具
 *
 * NumberUtil.factorial 阶乘
 * NumberUtil.sqrt 平方根
 * NumberUtil.divisor 最大公约数
 * NumberUtil.multiple 最小公倍数
 * NumberUtil.getBinaryStr 获得数字对应的二进制字符串
 * NumberUtil.binaryToInt 二进制转int
 * NumberUtil.binaryToLong 二进制转long
 * NumberUtil.compare 比较两个值的大小
 * NumberUtil.toStr 数字转字符串，自动并去除尾小数点儿后多余的0
 *
 */
public class NumberUtilDemo {
    public static void main(String[] args) {
        double b = 1111111111111111111111d;
        double c = 2222222222222222222222d;
        double d = 100000000l;
        double e = 1000l;

        double add = NumberUtil.add(1111111111111111111111d, 2222222222222222222222d);
        System.out.println(add);

        double sub = NumberUtil.div(e, d,5);
        System.out.println(sub);

        long f = 299792458;//光速
        String format = NumberUtil.decimalFormat(",###", f);//299,792,458
        System.out.println(format);
    }
}