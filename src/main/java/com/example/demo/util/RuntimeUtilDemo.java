package com.example.demo.util;

import cn.hutool.core.util.RuntimeUtil;

/**
 * 命令行Demo
 * exec 执行命令行命令，返回Process对象，Process可以读取执行命令后的返回内容的流
 */
public class RuntimeUtilDemo {
    public static void main(String[] args) {
        String ipconfig = RuntimeUtil.execForStr("ipconfig");
        System.out.println(ipconfig);
    }
}