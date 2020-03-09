package com.example.demo.ext;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;

/**
 * 二维码的识别操作
 */
public class QrCodeUtilDemo {
    public static void main(String[] args) {
        // decode -> "http://hutool.cn/"
        String decode = QrCodeUtil.decode(FileUtil.file("e:/test/ssr1.png"));
        System.out.println(decode);
    }
}
