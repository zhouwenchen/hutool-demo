package com.example.demo.util;

import cn.hutool.core.codec.BCD;
import cn.hutool.core.lang.Assert;

/**
 * String strForTest = "123456ABCDEF";
 *
 * //转BCD
 * byte[] bcd = BCD.strToBcd(strForTest);
 * //解码BCD
 * String str = BCD.bcdToStr(bcd);
 * Assert.assertEquals(strForTest, str);
 */
public class BCDUtilDemo {
    public static void main(String[] args) {
        String strForTest = "123456ABCDEF";

//转BCD
        byte[] bcd = BCD.strToBcd(strForTest);
//解码BCD
        String str = BCD.bcdToStr(bcd);
        Assert.isTrue(strForTest.equals(str));
    }
}
