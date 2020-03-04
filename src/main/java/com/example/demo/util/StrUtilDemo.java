package com.example.demo.util;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.StrUtil;

/**
 * 字符串工具类的使用
 */
public class StrUtilDemo {

    public static void main(String[] args) {
        if(!StrUtil.hasBlank("abc","cccc")){
            Console.log("abc不为空");
        }

        // 去掉前后缀
        String jpg = StrUtil.removeSuffix("abc.jpg", ".jpg");
        System.out.println(jpg);

        // sub,对没有限制 fromIndex ,toIndex
        String str = "abcdefgh";
        String strSub1 = StrUtil.sub(str, 2, 3); //strSub1 -> c
        String strSub2 = StrUtil.sub(str, 2, -3); //strSub2 -> cde
        String strSub3 = StrUtil.sub(str, 3, 2); //strSub2 -> c

        // 字符串的格式化
        String template = "{}爱{}，就像老鼠爱大米";
        String str1 = StrUtil.format(template, "我", "你"); //str -> 我爱你，就像老鼠爱大米
        System.out.println(str1);
    }
}
