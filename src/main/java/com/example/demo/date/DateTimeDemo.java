package com.example.demo.date;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateTime;

import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 时间的测试
 */
public class DateTimeDemo {
    public static void main(String[] args) {

        // new方式创建
        Date date = new Date();
        DateTime dateTime = new DateTime(date);
        System.out.println(dateTime);

        // of 的创建方式
        DateTime now = DateTime.now();
        DateTime of = DateTime.of(date);
        System.out.println(now +"\t" + of);

        DateTime dateTime1 = new DateTime("2017-01-05 12:34:23", DatePattern.NORM_DATETIME_FORMAT);
        System.out.println(dateTime1.year());
        System.out.println(dateTime1.month());
        System.out.println(dateTime1.monthEnum());
        System.out.println(dateTime1.dayOfMonth());
        System.out.println(dateTime1.dayOfWeek());


        DateTime dateTime2 = new DateTime("2017-01-05 12:34:23", DatePattern.NORM_DATETIME_FORMAT);

        //默认情况下DateTime为可变对象，此时offset == dateTime
        DateTime offset = dateTime2.offset(DateField.YEAR, 0);

        //设置为不可变对象后变动将返回新对象，此时offset != dateTime
        dateTime2.setMutable(false);
        offset = dateTime2.offset(DateField.YEAR, 0);

        // 会抛出异常的信息，由于   dateTime2.setMutable(false); 设置了 dateTime2 为不可变对象
//        dateTime2.setTime(System.currentTimeMillis());

        DateTime dateTime3 = new DateTime("2017-01-05 12:34:23", DatePattern.NORM_DATETIME_FORMAT);
        //结果：2017-01-05 12:34:23
        String dateStr = dateTime3.toString();
        System.out.println(dateStr);
    }
}
