package com.example.demo.date;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import org.w3c.dom.CDATASection;

import java.util.Calendar;
import java.util.Date;

/**
 * 时间日期的转化
 */
public class DateUtilDemo {
    public static void main(String[] args) {
//        Date、long、Calendar之间的相互转换
        // 当前时间
        Date date = DateUtil.date();
        System.out.println(date);

        // 当前时间
        DateTime date1 = DateUtil.date(Calendar.getInstance());
        System.out.println(date1);

        // 当前时间
        DateTime date2 = DateUtil.date(System.currentTimeMillis());
        System.out.println(date2);

        //当前时间字符串，格式：yyyy-MM-dd HH:mm:ss
        String now = DateUtil.now();
        System.out.println(now);

        //当前日期字符串，格式：yyyy-MM-dd
        String today = DateUtil.today();
        System.out.println(today);

        /**
         * DateUtil.parse方法会自动识别一些常用格式，包括：
         *
         * yyyy-MM-dd HH:mm:ss
         * yyyy-MM-dd
         * HH:mm:ss
         * yyyy-MM-dd HH:mm
         * yyyy-MM-dd HH:mm:ss.SSS
         */
        String dateStr = "2017-03-01";
        DateTime data1 = DateUtil.parse(dateStr);
        System.out.println(data1);

        // 使用自定义的格式转化时间
        DateTime date3 = DateUtil.parse(dateStr, "YYYY-MM-dd");
        System.out.println(date3);

        // 格式化日期输出
        Date date4 = DateUtil.parse(dateStr);
        // 转化成指定格式的时间字符串
        String format = DateUtil.format(date4, "YYYY/MM/dd");
        System.out.println(format);

        String s = DateUtil.formatDateTime(data1);
        System.out.println(s);

        String dateStr1 = "2017-03-01 22:33:23";
        Date date5 = DateUtil.parse(dateStr1);

    //一天的开始，结果：2017-03-01 00:00:00
        Date beginOfDay = DateUtil.beginOfDay(date5);
        System.out.println(beginOfDay);

    //一天的结束，结果：2017-03-01 23:59:59
        Date endOfDay = DateUtil.endOfDay(date5);
        System.out.println(endOfDay);


    }
}
