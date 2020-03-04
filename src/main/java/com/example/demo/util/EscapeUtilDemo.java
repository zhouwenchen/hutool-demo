package com.example.demo.util;

import cn.hutool.core.util.EscapeUtil;

public class EscapeUtilDemo {
    public static void main(String[] args) {
        String escape = EscapeUtil.escape("http://123.59.85.60/datacenter/h5channelcoincidecount/getdetailip?startdate=20200226&enddate=20200226&qid=全部&crawler=nocrawler&pagesize=100&page=1&_=1582781759107");
        System.out.println(escape);
        String unescape = EscapeUtil.unescape(escape);
        System.out.println(unescape);
    }
}
