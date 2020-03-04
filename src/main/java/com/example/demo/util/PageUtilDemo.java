package com.example.demo.util;

import cn.hutool.core.util.PageUtil;
import cn.hutool.core.util.StrUtil;

import java.util.Arrays;

/**
 * 分页工具类
 */
public class PageUtilDemo {
    public static void main(String[] args) {
        int[] startEnd1 = PageUtil.transToStartEnd(1, 10);//[0, 10]
        int[] startEnd2 = PageUtil.transToStartEnd(2, 10);//[10, 20]
        Arrays.stream(startEnd1).forEach(System.out::println);

        int totalPage = PageUtil.totalPage(20, 3);//7
        System.out.println(StrUtil.format("页数是{}",totalPage));
        String format = String.format("页数是%s", totalPage);
        System.out.println(format);
    }
}
