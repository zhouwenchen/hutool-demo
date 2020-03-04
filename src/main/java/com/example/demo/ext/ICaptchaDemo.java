package com.example.demo.ext;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.core.lang.Console;

/**
 * 验证码的工具类
 */
public class ICaptchaDemo {
    public static void main(String[] args) {
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(200, 100);
        lineCaptcha.write("e:/test/abc.jpg");
        Console.log(lineCaptcha.getCode());
    }
}
