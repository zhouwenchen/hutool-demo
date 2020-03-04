package com.example.demo.util;

import cn.hutool.core.collection.CollUtil;

import java.util.List;

/**
 * 集合工具类
 */
public class CollectionUtilDemo {

    public static void main(String[] args) {

        // join 字符串连接操作
        String[] col= new String[]{"a","b","c","d","e"};
        List<String> colList = CollUtil.newArrayList(col);
        String str = CollUtil.join(colList, "#"); //str -> a#b#c#d#e
        System.out.println(str);

        //
    }
}
