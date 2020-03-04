package com.example.demo.ext;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.lang.Dict;

/**
 * map的扩展操作
 */
public class HashMapDictDemo {
    public static void main(String[] args) {
        Dict set = Dict.create()
                .set("a", 1)
                .set("b", 2)
                .set("c", 3);
        int a = (int) set.get("a");
        System.out.println(a);

        Dict dict = Dict.create()
                .set("key1", 1)//int
                .set("key2", 1000L)//long
                .set("key3", DateTime.now());//Date

        dict.forEach((s, o) -> System.out.println(s+"\t"+o));

        System.out.println(dict.getInt("key1"));
    }
}
