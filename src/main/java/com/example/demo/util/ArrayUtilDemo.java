package com.example.demo.util;

import cn.hutool.core.lang.Assert;
import cn.hutool.core.lang.Editor;
import cn.hutool.core.util.ArrayUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 数据utildemo
 */
public class ArrayUtilDemo {
    public static void main(String[] args) {
        // 新建泛型数组
//        String[] array = ArrayUtil.newArray(String.class, 3);
        Object[] array = ArrayUtil.newArray(3);
        Arrays.stream(array).forEach(System.out::println);

        Integer[] b = {1,2,3};
        Integer[] clone = ArrayUtil.clone(b);
        boolean bool = Arrays.equals(b, clone);
        System.out.println(bool);

        /**
         *  仅仅保留偶数的数据
         */
        Integer[] a = {1,2,3,4,5,6};
        Integer[] filter = ArrayUtil.filter(a, new Editor<Integer>(){
            @Override
            public Integer edit(Integer t) {
                return (t % 2 == 0) ? t : null;
            }});
        boolean booblean = Arrays.equals(filter, new Integer[]{2,4,6});
        System.out.println(booblean);

//        List<Integer> collect = Arrays.stream(a).filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer % 2 == 0;
//            }
//        }).collect(Collectors.toList());

        List<Integer> collect = Arrays.stream(a).filter(o -> o % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);


        String[] keys = {"a", "b", "c"};
        Integer[] values = {1,2,3};
        Map<String, Integer> map = ArrayUtil.zip(keys, values, true);
        System.out.println(map);
        // 遍历map操作
        map.keySet().forEach(key-> System.out.println(key + "\t" + map.get(key)));

        map.entrySet().forEach(entry-> System.out.println(entry.getKey() + "\t" + entry.getValue()));

        map.entrySet().iterator().forEachRemaining(entry-> System.out.println(entry.getKey()+"\t"+ entry.getValue()));

        map.values().forEach(o-> System.out.println(o));

        map.forEach((k,v)-> System.out.println(k+"\t"+v));


        // 数组的相关的装箱和拆箱操作
        int[] b1 = {1,2,3};
        Integer[] wrap = ArrayUtil.wrap(b1);
        System.out.println(wrap);
        int[] ints = ArrayUtil.unWrap(wrap);
        boolean equals = Arrays.equals(b1, ints);
        System.out.println(equals);

        // 转化成字符串
        String s = ArrayUtil.toString(b1);
        System.out.println(s);

        String join = ArrayUtil.join(b1, "#");
        System.out.println(join);
    }
}
