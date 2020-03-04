package com.example.demo.convert;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.lang.TypeReference;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.json.JSONUtil;
import org.springframework.core.convert.converter.Converter;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 常见的类型转化
 */
public class ConvertDemo {
    public static void main(String[] args) {
//        parseStr();
        // 2.转化成指定类型数组
//        parseIntArray();
        // 3.转换为日期对象：
        String a = "1991-12-18";
        Date date = Convert.toDate(a);
        System.out.println(date);

        // 4.转化成集合
        Object[] arr = {"a", "你", "好", "", 1};
        List list = Convert.convert(List.class, arr);
        System.out.println(list);

        //从4.1.11开始可以这么用
        List<?> objects = Convert.toList(arr);
        System.out.println(objects);

        // TypeReference 可以自定义需要的返回值的类型
        Object[] arr2 = { "a", "你", "好", "", 1 };
        List<String> list3 = Convert.convert(new TypeReference<List<String>>() {}, arr2);
        System.out.println(list3);

        // 半角转化成全角的形式
        String str = "123456789";
        //结果为："１２３４５６７８９"
        String sab = Convert.toSBC(str);
        System.out.println(sab);

        // 全角转换成半角
        String dbcstr = "１２３４５６７８９";
        String dbc = Convert.toDBC(dbcstr);
        System.out.println(dbc);

        // 转化成（16进制）hex进制的字符串
        String hexStr = "我是一个小小的可爱的字符串";
        String hex = Convert.toHex(hexStr, CharsetUtil.CHARSET_UTF_8);
        System.out.println(hex); // e68891e698afe4b880e4b8aae5b08fe5b08fe79a84e58fafe788b1e79a84e5ad97e7aca6e4b8b2

        // (16进制)字符串转化成普通的字符串
        String hexOriStr = Convert.hexToStr(hex, CharsetUtil.CHARSET_UTF_8);
        System.out.println(hexOriStr); // 我是一个小小的可爱的字符串

        // Unicode和字符串转换
        String unicodeStr = "我是一个小小的可爱的字符串";
        String unicode = Convert.strToUnicode(unicodeStr);
        System.out.println(unicode); // \u6211\u662f\u4e00\u4e2a\u5c0f\u5c0f\u7684\u53ef\u7231\u7684\u5b57\u7b26\u4e32
        System.out.println(Convert.unicodeToStr(unicode));

        // 编码转化
        String chartStr = "我不是乱码";
        String utf8_iso = Convert.convertCharset(chartStr, CharsetUtil.UTF_8, CharsetUtil.ISO_8859_1);
        System.out.println(utf8_iso);
        String iso_utf8 = Convert.convertCharset(utf8_iso, CharsetUtil.ISO_8859_1, CharsetUtil.UTF_8);
        System.out.println(iso_utf8);

        // 时间单位转化
        long time = 4535345;
        long minutes = Convert.convertTime(time, TimeUnit.MILLISECONDS, TimeUnit.MINUTES);
        System.out.println(minutes);

        // 金钱大小写的转化
        double moneky = 67556.32;
        //结果为："陆万柒仟伍佰伍拾陆元叁角贰分"
        String digitUppercase = Convert.digitToChinese(moneky);
        System.out.println(digitUppercase);

        // 原始类型和包装类型的转化
        // 去包装类型
        Class<?> unWraped = Convert.unWrap(Integer.class);
        System.out.println(unWraped);
        // 包装类型
        Class<?> wrap = Convert.wrap(long.class);
        System.out.println(wrap);



    }

    /**
     * 转化成指定类型数组
     */
    private static void parseIntArray() {
        String[] b = { "1", "2", "3", "4" };
        Integer[] its = Convert.toIntArray(b);
        Arrays.stream(its).forEach(System.out::print);

        long[] c = {1,2,3,4,5};
        Integer[] integers = Convert.toIntArray(b);
        Arrays.stream(integers).forEach(System.out::print);
    }

    /**
     * 数值类型 转化成 字符串
     */
    private static void parseStr() {
        String s = Convert.toStr(1);
        System.out.println(s);

        long[] b = {1,2,3,4,5};
        String s1 = Convert.toStr(b);
        System.out.println(s1);
    }
}
