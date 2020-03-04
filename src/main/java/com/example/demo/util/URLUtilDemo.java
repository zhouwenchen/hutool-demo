package com.example.demo.util;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.URLUtil;

/**
 * URLDemo
 */
public class URLUtilDemo {
    public static void main(String[] args) {
        String url = "http://www.hutool.cn//aaa/bbb";
        // 结果为：http://www.hutool.cn/aaa/bbb
        String normalize = URLUtil.normalize(url);
        System.out.println(normalize);

        url = "http://www.hutool.cn//aaa/\\bbb?a=1&b=2";
        // 结果为：http://www.hutool.cn/aaa/bbb?a=1&b=2
        normalize = URLUtil.normalize(url);
        System.out.println(normalize);

        String body = "366466 - 副本.jpg";
        // 结果为：366466%20-%20%E5%89%AF%E6%9C%AC.jpg
        String encode = URLUtil.encode(body);
        Console.log(encode);
    }
}