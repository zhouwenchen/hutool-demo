package com.example.demo.util;

import cn.hutool.core.util.ZipUtil;

import java.io.File;

/**
 * 压缩包的工具类
 */
public class ZipUtilDemo {
    public static void main(String[] args) {
        // 压缩
        File file = ZipUtil.zip("e:\\test\\log");
        System.out.println(file.getAbsolutePath()+"\t" + file.getName());

        // 解压缩文件
        File unzip = ZipUtil.unzip("e:\\test\\log.zip", "e:\\test\\log\\test");
        System.out.println(unzip.getAbsolutePath()+"\t"+file.getName());

        // gzip 的压缩方式,主要用于网络传播
        byte[] gzip = ZipUtil.gzip(new File("e:\\test\\abc.xml"));
        // 解压缩的方式ungzip的方式
        byte[] bytes = ZipUtil.unGzip(gzip);
        System.out.println(new String(bytes));
    }
}
