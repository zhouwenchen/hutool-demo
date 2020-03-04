package com.example.demo.util;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.HexUtil;

/**
 * 16进制的操作
 */
public class HexDemo {
    public static void main(String[] args) {
//        String str = "A";
        String str = "好看无公害";
        String chars = HexUtil.encodeHexStr(str, CharsetUtil.CHARSET_UTF_8);
        System.out.println(chars);
        String decodedStr = HexUtil.decodeHexStr(chars);
        String decodedStr2 = HexUtil.decodeHexStr("E5A5BDE79C8BE697A0E585ACE5AEB3");
        System.out.println(decodedStr);
        System.out.println(decodedStr2);
    }
}
