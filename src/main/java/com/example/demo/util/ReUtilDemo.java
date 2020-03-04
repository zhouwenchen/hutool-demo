package com.example.demo.util;

import cn.hutool.core.util.ReUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表表达式Demo
 */
public class ReUtilDemo {
    public static void main(String[] args) {
        // 正则表达式的基本操作
        String str = "ZZZaaabbbccc中文1234";
        String regex = "[a-z]+";
        Pattern p = Pattern.compile(regex, Pattern.DOTALL);
        Matcher m = p.matcher(str);
        if(m.find()){
            String group = m.group(0);
            System.out.println(group);
        }

        // 抽取多个分组，然后拼接起来
        String content = "ZZZaaabbbccc中文1234";
        String s = ReUtil.extractMulti("(\\w)aa(\\w)", content, "$1-$2");
        System.out.println(s);

        String content1 = "ZZZaaabbbccc中文1234";
        String resultDelFirst = ReUtil.delFirst("(\\w)aa(\\w)", content1);
        System.out.println(resultDelFirst);

        String content2 = "ZZZaaabbbccc中文1234";
        List<String> resultFindAll = ReUtil.findAll("\\w{2}", content2, 0, new ArrayList<String>());
        // 结果：["ZZ", "Za", "aa", "bb", "bc", "cc", "12", "34"]
        System.out.println(resultFindAll);

        // 找到匹配的第一个
        Integer resultGetFirstNumber = ReUtil.getFirstNumber(content);
        // 结果：1234
        System.out.println(resultGetFirstNumber);

        // 判断是否匹配
        String content4 = "ZZZaaabbbccc中文1234";
        boolean isMatch = ReUtil.isMatch("\\w+[\u4E00-\u9FFF]+\\d+", content4);
        System.out.println(isMatch);

        // 查找并替换
        //此处把1234替换为 ->1234<-
        String replaceAll = ReUtil.replaceAll(content, "(\\d+)", "->$1<-");
        System.out.println(replaceAll);

        // 转义
        String escape = ReUtil.escape("我有个$符号{}");
        System.out.println(escape);
    }
}
